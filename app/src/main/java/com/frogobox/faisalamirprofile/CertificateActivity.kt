package com.frogobox.faisalamirprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.frogobox.faisalamirprofile.adapter.EducationAdapter
import com.frogobox.faisalamirprofile.adapter.SocialMediaAdapter
import com.frogobox.faisalamirprofile.model.Education
import com.frogobox.faisalamirprofile.model.SocialMedia
import kotlinx.android.synthetic.main.activity_certificate.*

class CertificateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_certificate)

        val arrayEducation : MutableList<Education> = mutableListOf()

        arrayEducation.add(Education(R.drawable.img_logo_smasa, getString(R.string.text_edu_high_school_level), getString(R.string.text_edu_high_school_institute), "", getString(R.string.text_edu_high_school_year)))
        arrayEducation.add(Education(R.drawable.img_logo_telu, getString(R.string.text_edu_diploma_level), getString(R.string.text_edu_diploma_institute), getString(R.string.text_edu_diploma_major), getString(R.string.text_edu_diploma_year)))

        val adapter = EducationAdapter(this, arrayEducation)
        val mLayoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL ,false)

        rv_education.adapter = adapter
        rv_education.layoutManager = mLayoutManager


    }
}
