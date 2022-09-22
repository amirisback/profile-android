package com.frogobox.faisalamirprofile.util

import android.content.Context
import java.io.IOException

/**
 * Created by Faisal Amir on 22/09/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

fun Context.getRawJson(filename: String): String {
    return try {
        assets.open(filename).bufferedReader().use { it.readText() }
    } catch (ioException: IOException) {
        ioException.printStackTrace()
        return ""
    }
}