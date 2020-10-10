package com.alexander.digiotest.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.alexander.digiotest.R
import com.alexander.digiotest.databinding.SpotlightItemBinding
import com.alexander.digiotest.model.Spotlight

class SpotlightAdapter : RecyclerView.Adapter<SpotlightViewHolder>() {

    var spotlights = listOf<Spotlight>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataBindingUtil.inflate<SpotlightItemBinding>(
            LayoutInflater.from(parent.context),
            R.layout.spotlight_item,
            parent,
            false
        ).let { SpotlightViewHolder(it) }

    override fun onBindViewHolder(holder: SpotlightViewHolder, position: Int) = holder.bind(spotlights[position])

    override fun getItemCount(): Int = spotlights.size
}