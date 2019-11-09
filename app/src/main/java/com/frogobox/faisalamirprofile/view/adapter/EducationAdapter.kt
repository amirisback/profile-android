package com.frogobox.faisalamirprofile.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.frogobox.faisalamirprofile.model.Education
import com.frogobox.speechbooster.base.view.BaseRecyclerViewAdapter
import com.frogobox.speechbooster.base.view.BaseRecyclerViewHolder
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
class EducationAdapter : BaseRecyclerViewAdapter<Education, EducationAdapter.EducationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        EducationViewHolder(
            LayoutInflater.from(mContext).inflate(
                mRecyclerViewLayout,
                parent,
                false
            )
        )

    inner class EducationViewHolder(view: View) : BaseRecyclerViewHolder<Education>(view) {

        private val imgSchoolLogo = view.img_school_logo
        private val tvEduInstitute = view.tv_edu_institute
        private val tvEduLevel = view.tv_edu_level
        private val tvEduMajor = view.tv_edu_major
        private val tvEduYear = view.tv_edu_year

        override fun initComponent(data: Education) {
            super.initComponent(data)
            imgSchoolLogo.setImageResource(data.imageLogo)
            tvEduLevel.text = data.level
            tvEduInstitute.text = data.institute
            tvEduMajor.text = data.major
            tvEduYear.text = data.year
        }
    }
}