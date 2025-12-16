package com.app.cryptoapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.cryptoapp.R
import com.app.cryptoapp.model.CryptoModel

class CryptoAdapter(
    private val items: List<CryptoModel>
) : RecyclerView.Adapter<CryptoAdapter.CryptoViewHolder>() {

    inner class CryptoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvSymbol: TextView = itemView.findViewById(R.id.tvSymbol)
        val tvPrice: TextView = itemView.findViewById(R.id.tvPrice)
        val tvChange: TextView = itemView.findViewById(R.id.tvChange)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CryptoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.crypto_item, parent, false)
        return CryptoViewHolder(view)
    }

    override fun onBindViewHolder(holder: CryptoViewHolder, position: Int) {
        val item = items[position]

        holder.tvSymbol.text = item.ShortSymbol
        holder.tvPrice.text = "$${item.Price}"
        holder.tvChange.text = "${item.ChangePercent}%"

        // đổi màu theo tăng/giảm
        if (item.ChangePercent >= 0) {
            holder.tvChange.setTextColor(
                holder.itemView.context.getColor(android.R.color.holo_green_dark)
            )
        } else {
            holder.tvChange.setTextColor(
                holder.itemView.context.getColor(android.R.color.holo_red_dark)
            )
        }
    }

    override fun getItemCount() = items.size
}
