package com.alexander.digiotest.ui

import androidx.recyclerview.widget.RecyclerView
import com.alexander.digiotest.databinding.ProductItemBinding
import com.alexander.digiotest.model.Product

class ProductViewHolder (private val binding: ProductItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Product) {
        binding.apply {
            executePendingBindings()
        }
    }
}