package com.frogobox.faisalamirprofile.view.adapter

import android.view.View
import android.view.ViewGroup
import com.frogobox.faisalamirprofile.base.adapter.BaseViewAdapter
import com.frogobox.faisalamirprofile.base.adapter.BaseViewHolder
import com.frogobox.faisalamirprofile.model.SocialMedia
import kotlinx.android.synthetic.main.item_social_media.view.*

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * FaisalAmirProfile
 * Copyright (C) 15/07/2019.
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

class SocialMediaAdapter : BaseViewAdapter<SocialMedia>() {

    inner class SocialMediaViewHolder(view: View) : BaseViewHolder<SocialMedia>(view) {

        private val imgIcon = view.img_icon
        private val tvLink = view.tv_link

        override fun initComponent(data: SocialMedia) {
            super.initComponent(data)
            imgIcon.setImageResource(data.icon)
            tvLink.text = data.link
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<SocialMedia> {
        return SocialMediaViewHolder(viewLayout(parent))
    }
}