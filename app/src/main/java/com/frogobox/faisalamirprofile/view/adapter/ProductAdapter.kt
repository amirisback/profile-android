package com.frogobox.faisalamirprofile.view.adapter

import android.view.View
import android.view.ViewGroup
import com.frogobox.faisalamirprofile.base.adapter.BaseViewAdapter
import com.frogobox.faisalamirprofile.base.adapter.BaseViewHolder
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
 * com.frogobox.faisalamirprofile.view.adapter
 *
 */
class ProductAdapter : BaseViewAdapter<Product>() {

    inner class ProductViewHolder(view: View) : BaseViewHolder<Product>(view) {

        private val imgProductIcon = view.img_product_icon
        private val tvProductName = view.tv_product_name

        override fun initComponent(data: Product) {
            super.initComponent(data)
            imgProductIcon.setImageResource(data.productIcon)
            tvProductName.text = data.productName
            tvProductName.setCompoundDrawablesWithIntrinsicBounds(data.productType, 0, 0, 0);
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Product> {
        return ProductViewHolder(viewLayout(parent))
    }
}