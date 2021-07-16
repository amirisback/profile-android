package com.frogobox.faisalamirprofile.mvvm.main

import android.os.Bundle
import com.bumptech.glide.Glide
import com.frogobox.faisalamirprofile.core.BaseActivity
import com.frogobox.faisalamirprofile.databinding.ActivityAboutUsBinding

class AboutUsActivity : BaseActivity<ActivityAboutUsBinding>() {

    override fun setupViewBinding(): ActivityAboutUsBinding {
        return ActivityAboutUsBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {}

    override fun setupUI(savedInstanceState: Bundle?) {
        setupDetailActivity("")
        Glide.with(this)
            .load("https://lh3.googleusercontent.com/XMPeB-RfCZLcWonMXASsBXCb9XSx-OlOo0smJSS07nqf-Gar12297syEhpaE2-Qf-g=w144-h144-n-rw")
            .into(binding.ivLogo)

    }

}
