package com.frogobox.faisalamirprofile.core

import android.os.Bundle
import androidx.viewbinding.ViewBinding
import com.frogobox.sdk.view.FrogoBindFragment

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
abstract class BaseFragment<VB : ViewBinding> : FrogoBindFragment<VB>() {

    protected lateinit var mActivity: BaseActivity<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivity = (activity as BaseActivity<*>)
    }

}