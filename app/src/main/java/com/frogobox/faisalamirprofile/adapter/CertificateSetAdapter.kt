package com.frogobox.faisalamirprofile.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.model.CertificateSet
import kotlinx.android.synthetic.main.container_title.view.*
import kotlinx.android.synthetic.main.list_item_skill.view.*

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * FaisalAmirProfile
 * Copyright (C) 26/07/2019.
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
class CertificateSetAdapter (
    private val context: Context?,
    private val dataList: List<CertificateSet>,
    private val adapter: EducationAdapter,
    private val layoutManager: LinearLayoutManager) : RecyclerView.Adapter<CertificateSetAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_skill, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(dataList[position], adapter, layoutManager)
    }

    override fun getItemCount(): Int = dataList.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        private val tvContentTitle = view.tv_content_title
        private val tvContentSubtitle = view.tv_content_subtitle
        private val rvItem = view.rv_item

        fun bindItem(data: CertificateSet, adapter: EducationAdapter, layoutManager: LinearLayoutManager) {
            tvContentTitle.text = data.contentTitle
            tvContentSubtitle.text = data.contentSubTitle
            rvItem.adapter = adapter
            rvItem.layoutManager = layoutManager
        }
    }
}