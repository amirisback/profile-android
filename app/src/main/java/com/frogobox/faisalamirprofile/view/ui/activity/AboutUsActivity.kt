package com.frogobox.faisalamirprofile.view.ui.activity

import android.os.Bundle
import com.bumptech.glide.Glide
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.base.ui.BaseActivity
import kotlinx.android.synthetic.main.activity_about_us.*

class AboutUsActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)
        setupDetailActivity("")

        Glide.with(this)
            .load("https://lh3.googleusercontent.com/XMPeB-RfCZLcWonMXASsBXCb9XSx-OlOo0smJSS07nqf-Gar12297syEhpaE2-Qf-g=w144-h144-n-rw")
            .into(iv_logo)

    }

}
