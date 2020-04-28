package com.frogobox.faisalamirprofile.view.ui.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.base.ui.BaseFragment
import com.frogobox.faisalamirprofile.util.PagerHelper
import kotlinx.android.synthetic.main.fragment_product.*


class ProductFragment : BaseFragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
    }

    private fun setupViewPager(){
        val pagerAdapter = PagerHelper(childFragmentManager)
        pagerAdapter.setupPagerFragment(ProductReleaseFragment(), resources.getString(R.string.title_product_release))
        pagerAdapter.setupPagerFragment(ProductDebugFragment(), resources.getString(R.string.title_product_debug))
        viewpager.adapter = pagerAdapter
        tablayout.setupWithViewPager(viewpager)
    }

}
