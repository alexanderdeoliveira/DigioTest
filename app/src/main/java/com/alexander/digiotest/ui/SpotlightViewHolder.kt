package com.alexander.digiotest.ui

import androidx.recyclerview.widget.RecyclerView
import com.alexander.digiotest.databinding.SpotlightItemBinding
import com.alexander.digiotest.model.Spotlight

class SpotlightViewHolder(private val binding: SpotlightItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Spotlight) {
        binding.apply {
            spotlight = item
            executePendingBindings()
        }
    }
}