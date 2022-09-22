package com.frogobox.faisalamirprofile.mvvm.main

import android.os.Bundle
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.core.BaseActivity
import com.frogobox.faisalamirprofile.databinding.ActivityAboutUsBinding
import com.frogobox.sdk.ext.glideLoad

class AboutUsActivity : BaseActivity<ActivityAboutUsBinding>() {

    override fun setupViewBinding(): ActivityAboutUsBinding {
        return ActivityAboutUsBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {}

    override fun onCreateExt(savedInstanceState: Bundle?) {
        super.onCreateExt(savedInstanceState)
        setupDetailActivity("", R.drawable.ic_toolbar_back_home, R.color.colorBaseWhite)
        binding.ivLogo.glideLoad("https://play-lh.googleusercontent.com/jFHa5EHuPWpvwcRWoUyXpxn97Jo68h5xNFMf7vj32Ygc8Z99Rz9E3CJzePXkY8gcJQ=w288-h288-n-rw")
    }

}
