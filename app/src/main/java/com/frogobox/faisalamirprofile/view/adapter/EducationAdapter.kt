package com.frogobox.faisalamirprofile.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.model.Education
import kotlinx.android.synthetic.main.item_education.view.*

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
class EducationAdapter (private val context: Context?, private val dataList: List<Education>) : RecyclerView.Adapter<EducationAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_education, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(dataList[position])
    }

    override fun getItemCount(): Int = dataList.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        private val imgSchoolLogo = view.img_school_logo
        private val tvEduInstitute = view.tv_edu_institute
        private val tvEduLevel = view.tv_edu_level
        private val tvEduMajor= view.tv_edu_major
        private val tvEduYear = view.tv_edu_year

        fun bindItem(data: Education) {
            imgSchoolLogo.setImageResource(data.imageLogo)
            tvEduLevel.text = data.level
            tvEduInstitute.text = data.institute
            tvEduMajor.text = data.major
            tvEduYear.text = data.year
        }
    }
}