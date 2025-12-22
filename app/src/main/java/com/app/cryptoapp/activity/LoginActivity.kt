package com.app.cryptoapp.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.cryptoapp.MainActivity
import com.app.cryptoapp.R
import com.app.cryptoapp.databinding.ActivityLoginBinding
import com.app.cryptoapp.model.LoginRequest
import com.app.cryptoapp.model.LoginResponse
import com.app.cryptoapp.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Click Login
        binding.btnLogin.setOnClickListener {
            // FakeStoreAPI requires 'username', not email.
            // However, we kept the variable name 'email' for now, but UI should guide user.
            val username = binding.edtEmail.text.toString().trim()
            val password = binding.edtPassword.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đủ thông tin", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            RetrofitClient.instance.login(LoginRequest(username, password))
                .enqueue(object : Callback<LoginResponse> {
                    override fun onResponse(
                        call: Call<LoginResponse>,
                        response: Response<LoginResponse>
                    ) {
                        if (response.isSuccessful && response.body() != null) {
                            Toast.makeText(
                                this@LoginActivity,
                                "Login thành công: ${response.body()!!.token}",
                                Toast.LENGTH_SHORT
                            ).show()
                            startActivity(Intent(this@LoginActivity, MainActivity::class.java))
                            finish()
                        } else {
                            // Show error code and basic message
                            val errorBody = response.errorBody()?.string() ?: "Unknown Error"
                            Toast.makeText(this@LoginActivity, "Login failed: ${response.code()} - $errorBody", Toast.LENGTH_LONG).show()
                        }
                    }

                    override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                        Toast.makeText(this@LoginActivity, "Error: ${t.message}", Toast.LENGTH_LONG).show()
                    }
                })
        }

        // Chuyển sang SignUp
        binding.tvSignup.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }
    }
}
