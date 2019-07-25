package com.frogobox.faisalamirprofile.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.adapter.CertificateSetAdapter
import com.frogobox.faisalamirprofile.adapter.EducationAdapter
import com.frogobox.faisalamirprofile.model.CertificateSet
import com.frogobox.faisalamirprofile.model.Education
import kotlinx.android.synthetic.main.activity_certificate_set.*

class CertificateSetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_certificate_set)
        initListView()
    }

    private fun initListView(){
        val arrayEducation : MutableList<Education> = mutableListOf()

        arrayEducation.add(
            Education(
                R.drawable.img_logo_smasa, getString(R.string.text_edu_high_school_level), getString(
                    R.string.text_edu_high_school_institute
                ), "", getString(R.string.text_edu_high_school_year))
        )
        arrayEducation.add(
            Education(
                R.drawable.img_logo_telu, getString(R.string.text_edu_diploma_level), getString(
                    R.string.text_edu_diploma_institute
                ), getString(R.string.text_edu_diploma_major), getString(R.string.text_edu_diploma_year))
        )

        val educationAdapter = EducationAdapter(this, arrayEducation)
        val educationLayoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL ,false)

        val arrayCertificateSet : MutableList<CertificateSet> = mutableListOf()
        arrayCertificateSet.add(CertificateSet("Set", "Set"))
        arrayCertificateSet.add(CertificateSet("Set", "Set"))
        arrayCertificateSet.add(CertificateSet("Set", "Set"))
        arrayCertificateSet.add(CertificateSet("Set", "Set"))

        val certificateSetAdapter = CertificateSetAdapter(this, arrayCertificateSet, educationAdapter, educationLayoutManager)

        val certificateSetLayoutManager = LinearLayoutManager(this)

        rv_certificate_set.adapter = certificateSetAdapter
        rv_certificate_set.layoutManager = certificateSetLayoutManager
    }

}
