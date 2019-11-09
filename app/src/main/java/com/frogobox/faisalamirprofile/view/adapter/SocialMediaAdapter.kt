package com.frogobox.faisalamirprofile.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.frogobox.faisalamirprofile.model.SocialMedia
import com.frogobox.speechbooster.base.view.BaseRecyclerViewAdapter
import com.frogobox.speechbooster.base.view.BaseRecyclerViewHolder
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

class SocialMediaAdapter :
    BaseRecyclerViewAdapter<SocialMedia, SocialMediaAdapter.SocialMediaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        SocialMediaViewHolder(
            LayoutInflater.from(mContext).inflate(
                mRecyclerViewLayout,
                parent,
                false
            )
        )

    inner class SocialMediaViewHolder(view: View) : BaseRecyclerViewHolder<SocialMedia>(view) {

        private val imgIcon = view.img_icon
        private val tvLink = view.tv_link

        override fun initComponent(data: SocialMedia) {
            super.initComponent(data)
            imgIcon.setImageResource(data.icon)
            tvLink.text = data.link
        }
    }
}