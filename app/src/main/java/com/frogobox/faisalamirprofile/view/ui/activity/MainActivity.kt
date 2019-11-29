package com.frogobox.faisalamirprofile.view.ui.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.base.ui.BaseActivity
import com.frogobox.faisalamirprofile.view.ui.fragment.ProfileFragment
import com.frogobox.faisalamirprofile.view.ui.fragment.EducationFragment
import com.frogobox.faisalamirprofile.view.ui.fragment.ProductFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupToolbar()
        setupBottomNav(R.id.framelayout_main_container)
        setupFragment(savedInstanceState)
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbar_main)
    }

    private fun setupFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            bottom_nav_main_menu.selectedItemId = R.id.bottom_menu_profile
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.toolbar_menu_about -> {
                baseStartActivity<AboutUsActivity>()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun setupBottomNav(frameLayout: Int) {
        bottom_nav_main_menu.clearAnimation()
        bottom_nav_main_menu.itemIconTintList = null
        bottom_nav_main_menu.setOnNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.bottom_menu_profile -> {
                    setupCustomTitleToolbar(R.string.title_about_me)
                    setupChildFragment(frameLayout,
                        ProfileFragment()
                    )
                }

                R.id.bottom_menu_product -> {
                    setupCustomTitleToolbar(R.string.title_product)
                    setupChildFragment(frameLayout,
                        ProductFragment()
                    )
                }

                R.id.bottom_menu_education -> {
                    setupCustomTitleToolbar(R.string.title_education)
                    setupChildFragment(frameLayout,
                        EducationFragment()
                    )
                }
            }

            true
        }

    }

}
