package com.frogobox.faisalamirprofile.base

import android.annotation.SuppressLint
import android.app.*
import android.app.assist.AssistContent
import android.content.*
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.content.res.AssetManager
import android.content.res.Configuration
import android.content.res.Resources
import android.database.Cursor
import android.database.DatabaseErrorHandler
import android.database.sqlite.SQLiteDatabase
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.*
import android.transition.Scene
import android.transition.TransitionManager
import android.util.AttributeSet
import android.view.*
import android.view.accessibility.AccessibilityEvent
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.view.ActionMode
import androidx.appcompat.widget.Toolbar
import androidx.core.app.SharedElementCallback
import androidx.core.app.TaskStackBuilder
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelStore
import androidx.loader.app.LoaderManager
import java.io.*
import java.util.concurrent.Executor
import java.util.function.Consumer

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

class BaseActivity : AppCompatActivity() {

}
