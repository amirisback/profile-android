package com.frogobox.faisalamirprofile.core

import android.content.Intent
import android.net.Uri
import androidx.viewbinding.ViewBinding
import com.frogobox.sdk.view.FrogoBindActivity


/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * FaisalAmirProfile
 * Copyright (C) 26/07/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.faisalamirprofile.base
 *
 */

abstract class BaseActivity<VB : ViewBinding> : FrogoBindActivity<VB>() {

    protected fun setupCustomTitleToolbar(title: Int) {
        supportActionBar?.setTitle(title)
    }

    fun baseStartExplicit(uri: String) {
        this.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(uri)))
    }

}
