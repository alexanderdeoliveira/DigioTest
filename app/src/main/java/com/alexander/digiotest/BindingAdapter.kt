package com.alexander.digiotest

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.alexander.digiotest.model.Product
import com.alexander.digiotest.model.Spotlight
import com.alexander.digiotest.ui.ProductAdapter
import com.alexander.digiotest.ui.SpotlightAdapter
import com.bumptech.glide.Glide

@BindingAdapter("bind:loadUrl")
fun bindUrlImage(view: ImageView, url: String) {
    Glide.with(view)
        .load(url)
        .into(view)
}

@BindingAdapter("bind:spotlights")
fun setSpotlights(view: RecyclerView, items: List<Spotlight>?) {
    view.adapter = SpotlightAdapter().apply {
        spotlights = items ?: emptyList()
        notifyDataSetChanged()
    }
}

@BindingAdapter("bind:products")
fun setProducts(view: RecyclerView, items: List<Product>?) {
    view.adapter = ProductAdapter().apply {
        products = items ?: emptyList()
        notifyDataSetChanged()
    }
}