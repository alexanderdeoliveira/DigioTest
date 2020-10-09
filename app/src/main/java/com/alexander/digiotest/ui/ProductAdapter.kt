package com.alexander.digiotest.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.alexander.digiotest.R
import com.alexander.digiotest.databinding.ProductItemBinding
import com.alexander.digiotest.model.Product

class ProductAdapter : RecyclerView.Adapter<ProductViewHolder>() {

    var products = listOf<Product>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataBindingUtil.inflate<ProductItemBinding>(
            LayoutInflater.from(parent.context),
            R.layout.product_item,
            parent,
            false
        ).let { ProductViewHolder(it) }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) = holder.bind(products[position])

    override fun getItemCount(): Int = products.size
}