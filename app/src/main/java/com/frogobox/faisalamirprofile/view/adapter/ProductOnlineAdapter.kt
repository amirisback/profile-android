package com.frogobox.faisalamirprofile.view.adapter

import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.frogobox.faisalamirprofile.base.adapter.BaseViewAdapter
import com.frogobox.faisalamirprofile.base.adapter.BaseViewHolder
import com.frogobox.faisalamirprofile.model.ProductOnline
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
class ProductOnlineAdapter : BaseViewAdapter<ProductOnline>() {

    inner class ProductViewHolder(view: View) : BaseViewHolder<ProductOnline>(view) {

        private val imgProductIcon = view.img_product_icon
        private val tvProductName = view.tv_product_name

        override fun initComponent(data: ProductOnline) {
            super.initComponent(data)
            Glide.with(itemView.context).load(data.productIcon).into(imgProductIcon)
            tvProductName.text = data.productName
            tvProductName.setCompoundDrawablesWithIntrinsicBounds(data.productType, 0, 0, 0);
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<ProductOnline> {
        return ProductViewHolder(viewLayout(parent))
    }
}