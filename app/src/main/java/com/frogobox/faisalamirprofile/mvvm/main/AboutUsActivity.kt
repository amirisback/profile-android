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
            .load("https://play-lh.googleusercontent.com/jFHa5EHuPWpvwcRWoUyXpxn97Jo68h5xNFMf7vj32Ygc8Z99Rz9E3CJzePXkY8gcJQ=w288-h288-n-rw")
            .into(binding.ivLogo)

    }

}
