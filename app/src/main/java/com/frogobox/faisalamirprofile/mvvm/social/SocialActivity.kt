package com.frogobox.faisalamirprofile.mvvm.social

import android.os.Bundle
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.core.BaseActivity
import com.frogobox.faisalamirprofile.databinding.ActivitySocialBinding
import com.frogobox.faisalamirprofile.util.PagerHelper

class SocialActivity : BaseActivity<ActivitySocialBinding>() {

    override fun setupViewBinding(): ActivitySocialBinding {
        return ActivitySocialBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {}

    override fun onCreateExt(savedInstanceState: Bundle?) {
        super.onCreateExt(savedInstanceState)
        setupToolbar()
        setupViewPager()
    }

    private fun setupToolbar() {
        setupDetailActivity("")
        supportActionBar?.elevation = 0f
    }

    private fun setupViewPager() {
        val pagerAdapter = PagerHelper(supportFragmentManager)
        pagerAdapter.setupPagerFragment(
            SocialMediaFragment(),
            resources.getString(R.string.title_social_media)
        )
        pagerAdapter.setupPagerFragment(
            SocialOrganizationFragment(),
            resources.getString(R.string.title_social_organization)
        )
        binding.apply {
            viewpager.adapter = pagerAdapter
            tablayout.setupWithViewPager(viewpager)
        }
    }

}