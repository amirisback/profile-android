package com.frogobox.faisalamirprofile.view.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.base.adapter.BaseViewListener
import com.frogobox.faisalamirprofile.base.ui.BaseFragment
import com.frogobox.faisalamirprofile.model.Education
import com.frogobox.faisalamirprofile.view.adapter.EducationAdapter
import kotlinx.android.synthetic.main.fragment_education.*


class EducationFragment : BaseFragment(), BaseViewListener<Education> {

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

    private fun initArrayModel(): MutableList<Education> {
        val arrayEducation: MutableList<Education> = mutableListOf()

        arrayEducation.add(
            Education(
                R.drawable.img_logo_edu_smasa,
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
                R.drawable.img_logo_edu_telu,
                getString(R.string.text_edu_diploma_level),
                getString(
                    R.string.text_edu_diploma_institute
                ),
                getString(R.string.text_edu_diploma_major),
                getString(R.string.text_edu_diploma_year)
            )
        )

        return arrayEducation
    }

    private fun initListView() {

        val adapter = EducationAdapter()
        val mLayoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)

        adapter.setupRequirement(this, initArrayModel(), R.layout.item_education)

        rv_education.adapter = adapter
        rv_education.layoutManager = mLayoutManager
    }

    override fun onItemClicked(data: Education) {}
    override fun onItemLongClicked(data: Education) {}

}
