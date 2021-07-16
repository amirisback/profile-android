package com.frogobox.faisalamirprofile.mvvm.education

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.core.BaseFragment
import com.frogobox.faisalamirprofile.databinding.FragmentEducationBinding
import com.frogobox.faisalamirprofile.databinding.ItemEducationBinding
import com.frogobox.faisalamirprofile.model.Education
import com.frogobox.recycler.core.IFrogoBindingAdapter


class EducationFragment : BaseFragment<FragmentEducationBinding>() {

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup
    ): FragmentEducationBinding {
        return FragmentEducationBinding.inflate(inflater, container, false)
    }

    override fun setupViewModel() {
    }

    override fun setupUI(savedInstanceState: Bundle?) {
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

        val callback = object : IFrogoBindingAdapter<Education, ItemEducationBinding> {
            override fun onItemClicked(data: Education) {
            }

            override fun onItemLongClicked(data: Education) {
            }

            override fun setViewBinding(parent: ViewGroup): ItemEducationBinding {
                return ItemEducationBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            }

            override fun setupInitComponent(view: ItemEducationBinding, data: Education) {
                view.apply {
                    imgSchoolLogo.setImageResource(data.imageLogo)
                    tvEduLevel.text = data.level
                    tvEduInstitute.text = data.institute
                    tvEduMajor.text = data.major
                    tvEduYear.text = data.year
                }
            }

        }

        binding?.apply {
            rvEducation.injectorBinding<Education, ItemEducationBinding>()
                .addData(initArrayModel())
                .addCallback(callback)
                .createLayoutLinearHorizontal(false)
                .build()
        }
    }


}
