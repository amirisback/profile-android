package com.frogobox.faisalamirprofile.view.ui.activity

import android.os.Bundle
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.base.ui.BaseActivity

class AboutUsActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)
        setupDetailActivity("")
    }

}
