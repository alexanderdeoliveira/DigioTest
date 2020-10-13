package com.alexander.digiotest

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.alexander.digiotest.model.Product
import com.alexander.digiotest.model.Spotlight
import com.alexander.digiotest.ui.ProductAdapter
import com.alexander.digiotest.ui.SpotlightAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

@BindingAdapter("loadUrl")
fun bindUrlImage(view: ImageView, url: String?) {
    url.let {
        Glide.with(view)
            .load(url)
            .apply(RequestOptions.bitmapTransform(RoundedCorners(24)))
            .into(view)
    }

}

@BindingAdapter("loadUrlProduct")
fun bindUrlImageProduct(view: ImageView, url: String?) {
    url.let {
        Glide.with(view)
            .load(url)
            .into(view)
    }

}

@BindingAdapter("spotlights")
fun setSpotlights(view: RecyclerView, items: List<Spotlight>?) {
    view.adapter = SpotlightAdapter().apply {
        spotlights = items ?: emptyList()
        notifyDataSetChanged()
    }
}

@BindingAdapter("products")
fun setProducts(view: RecyclerView, items: List<Product>?) {
    view.adapter = ProductAdapter().apply {
        products = items ?: emptyList()
        notifyDataSetChanged()
    }
}