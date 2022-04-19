package com.frogobox.faisalamirprofile.mvvm.product


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.core.BaseFragment
import com.frogobox.faisalamirprofile.databinding.FragmentProductBinding
import com.frogobox.faisalamirprofile.util.PagerHelper


class ProductFragment : BaseFragment<FragmentProductBinding>() {

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentProductBinding {
        return FragmentProductBinding.inflate(inflater, container, false)
    }

    override fun setupViewModel() {
    }

    override fun setupOnViewCreated(view: View, savedInstanceState: Bundle?) {
        setupViewPager()
    }

    private fun setupViewPager() {
        val pagerAdapter = PagerHelper(childFragmentManager)
        pagerAdapter.setupPagerFragment(
            ProductReleaseFragment(),
            resources.getString(R.string.title_product_release)
        )
        pagerAdapter.setupPagerFragment(
            ProductDebugFragment(),
            resources.getString(R.string.title_product_debug)
        )
        binding.apply {
            viewpager.adapter = pagerAdapter
            tablayout.setupWithViewPager(viewpager)
        }
    }

}
