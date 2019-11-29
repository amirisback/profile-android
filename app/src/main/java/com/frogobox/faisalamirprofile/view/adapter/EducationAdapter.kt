package com.frogobox.faisalamirprofile.view.adapter

import android.view.View
import android.view.ViewGroup
import com.frogobox.faisalamirprofile.base.adapter.BaseViewAdapter
import com.frogobox.faisalamirprofile.base.adapter.BaseViewHolder
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
class EducationAdapter : BaseViewAdapter<Education>() {

    inner class EducationViewHolder(view: View) : BaseViewHolder<Education>(view) {

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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Education> {
        return EducationViewHolder(viewLayout(parent))
    }
}