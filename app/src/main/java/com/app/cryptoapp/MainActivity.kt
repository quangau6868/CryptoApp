package com.app.cryptoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.cryptoapp.Adapter.CryptoAdapter
import com.app.cryptoapp.ViewModel.MainViewModel
import com.app.cryptoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        val adapter = CryptoAdapter(viewModel.loadData())

        binding.view.layoutManager = LinearLayoutManager(this)
        binding.view.adapter = adapter
    }
}
