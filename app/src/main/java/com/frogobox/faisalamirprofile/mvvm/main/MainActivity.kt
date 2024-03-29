package com.frogobox.faisalamirprofile.mvvm.main

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.core.BaseActivity
import com.frogobox.faisalamirprofile.databinding.ActivityMainBinding
import com.frogobox.faisalamirprofile.mvvm.education.EducationFragment
import com.frogobox.faisalamirprofile.mvvm.product.ProductFragment
import com.frogobox.faisalamirprofile.mvvm.profile.ProfileFragment

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun setupViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {}

    override fun onCreateExt(savedInstanceState: Bundle?) {
        super.onCreateExt(savedInstanceState)
        setupToolbar()
        setupBottomNav(binding.framelayoutMainContainer.id)
        setupFragment(savedInstanceState)
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.toolbar.toolbarMain)
    }

    private fun setupFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            binding.bottomNavMainMenu.selectedItemId = R.id.bottom_menu_profile
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.toolbar_menu_about -> {
                frogoStartActivity<AboutUsActivity>()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun setupBottomNav(frameLayout: Int) {
        binding.bottomNavMainMenu.apply {
            clearAnimation()
            itemIconTintList = null
            setOnNavigationItemSelectedListener {

                when (it.itemId) {
                    R.id.bottom_menu_profile -> {
                        setupCustomTitleToolbar(R.string.title_about_me)
                        setupChildFragment(
                            frameLayout,
                            ProfileFragment()
                        )
                    }

                    R.id.bottom_menu_product -> {
                        setupCustomTitleToolbar(R.string.title_product)
                        setupChildFragment(
                            frameLayout,
                            ProductFragment()
                        )
                    }

                    R.id.bottom_menu_education -> {
                        setupCustomTitleToolbar(R.string.title_education)
                        setupChildFragment(
                            frameLayout,
                            EducationFragment()
                        )
                    }
                }

                true
            }
        }

    }

}
