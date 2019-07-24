package com.frogobox.faisalamirprofile.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.model.SocialMedia
import kotlinx.android.synthetic.main.item_list_social_media.view.*

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
 * com.frogobox.faisalamirprofile.adapter
 *
 */

class SocialMediaAdapter (private val context: Context?, private val dataList: List<SocialMedia>) : RecyclerView.Adapter<SocialMediaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_social_media, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(dataList[position])
    }

    override fun getItemCount(): Int = dataList.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        private val imgIcon = view.img_icon
        private val tvLink = view.tv_link

        fun bindItem(data: SocialMedia) {
            imgIcon.setImageResource(data.icon)
            tvLink.text = data.link
        }
    }
}