package com.frogobox.faisalamirprofile.core

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.frogobox.sdk.view.FrogoFragment
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
abstract class BaseFragment<VB : ViewBinding> : FrogoFragment<VB>() {

    protected lateinit var mActivity: BaseActivity<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivity = (activity as BaseActivity<*>)
    }

}