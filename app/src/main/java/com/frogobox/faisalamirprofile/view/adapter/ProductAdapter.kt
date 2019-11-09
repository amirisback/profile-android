package com.frogobox.faisalamirprofile.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.frogobox.faisalamirprofile.model.Product
import com.frogobox.speechbooster.base.view.BaseRecyclerViewAdapter
import com.frogobox.speechbooster.base.view.BaseRecyclerViewHolder
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
 * com.frogobox.faisalamirprofile.view.adapter
 *
 */
class ProductAdapter : BaseRecyclerViewAdapter<Product, ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ProductViewHolder(LayoutInflater.from(mContext).inflate(mRecyclerViewLayout, parent, false))

    inner class ProductViewHolder(view: View) : BaseRecyclerViewHolder<Product>(view) {

        private val imgProductIcon = view.img_product_icon
        private val tvProductName = view.tv_product_name

        override fun initComponent(data: Product) {
            super.initComponent(data)
            imgProductIcon.setImageResource(data.productIcon)
            tvProductName.text = data.productName
            tvProductName.setCompoundDrawablesWithIntrinsicBounds(data.productType, 0, 0, 0);
        }
    }
}