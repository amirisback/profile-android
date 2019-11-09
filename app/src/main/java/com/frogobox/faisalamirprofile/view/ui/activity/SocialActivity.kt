package com.frogobox.faisalamirprofile.view.ui.activity

import android.os.Bundle
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.base.BaseActivity
import com.frogobox.faisalamirprofile.helper.PagerHelper
import com.frogobox.faisalamirprofile.view.ui.fragment.SocialMediaFragment
import com.frogobox.faisalamirprofile.view.ui.fragment.SocialOrganizationFragment
import kotlinx.android.synthetic.main.activity_social.*

class SocialActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social)
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
        viewpager.adapter = pagerAdapter
        tablayout.setupWithViewPager(viewpager)
    }


}
