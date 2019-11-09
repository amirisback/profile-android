package com.frogobox.faisalamirprofile.view.ui.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.view.adapter.EducationAdapter
import com.frogobox.faisalamirprofile.base.BaseFragment
import com.frogobox.faisalamirprofile.model.Education
import kotlinx.android.synthetic.main.fragment_education.*


class EducationFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_education, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListView()
    }

    private fun initListView() {
        val arrayEducation: MutableList<Education> = mutableListOf()

        arrayEducation.add(
            Education(
                R.drawable.img_logo_smasa,
                getString(R.string.text_edu_high_school_level),
                getString(
                    R.string.text_edu_high_school_institute
                ),
                "",
                getString(R.string.text_edu_high_school_year)
            )
        )
        arrayEducation.add(
            Education(
                R.drawable.img_logo_telu,
                getString(R.string.text_edu_diploma_level),
                getString(
                    R.string.text_edu_diploma_institute
                ),
                getString(R.string.text_edu_diploma_major),
                getString(R.string.text_edu_diploma_year)
            )
        )

        val adapter = EducationAdapter(context, arrayEducation)
        val mLayoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)

        rv_education.adapter = adapter
        rv_education.layoutManager = mLayoutManager
    }

}
