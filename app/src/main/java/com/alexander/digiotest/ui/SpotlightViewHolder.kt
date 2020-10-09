package com.alexander.digiotest.ui

import androidx.recyclerview.widget.RecyclerView
import com.alexander.digiotest.databinding.BannerItemBinding
import com.alexander.digiotest.model.Spotlight

class SpotlightViewHolder(private val binding: BannerItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Spotlight) {
        binding.apply {
            executePendingBindings()
        }
    }
}