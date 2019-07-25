package com.frogobox.faisalamirprofile.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.model.Product
import kotlinx.android.synthetic.main.item_product.view.*

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * FaisalAmirProfile
 * Copyright (C) 24/07/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.faisalamirprofile.adapter
 *
 */
class ProductAdapter (private val context: Context?, private val dataList: List<Product>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_product, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(dataList[position])
    }

    override fun getItemCount(): Int = dataList.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        private val imgProductIcon = view.img_product_icon
        private val tvProductName = view.tv_product_name

        fun bindItem(data: Product) {
            imgProductIcon.setImageResource(data.productIcon)
            tvProductName.text = data.productName
            tvProductName.setCompoundDrawablesWithIntrinsicBounds(data.productType, 0, 0, 0);
        }
    }
}