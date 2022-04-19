package com.frogobox.faisalamirprofile.core

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.view.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.frogobox.faisalamirprofile.R
import com.frogobox.sdk.view.FrogoActivity
import com.google.gson.Gson


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

abstract class BaseActivity<VB : ViewBinding> : FrogoActivity<VB>() {

    protected fun setupCustomTitleToolbar(title: Int) {
        supportActionBar?.setTitle(title)
    }

    fun baseStartExplicit(uri: String) {
        this.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(uri)))
    }

}
