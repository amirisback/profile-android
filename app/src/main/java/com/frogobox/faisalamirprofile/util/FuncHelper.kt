package com.frogobox.faisalamirprofile.util

import android.content.Context
import com.frogobox.faisalamirprofile.model.Product
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException

/*
 * Created by Faisal Amir
 * =========================================
 * Release-Profile-CV
 * Copyright (C) 28/04/2020.      
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * FrogoBox Inc
 * com.frogobox.faisalamirprofile.helper
 * 
 */
object FuncHelper {

    fun listProduct(context: Context, filename: String): MutableList<Product> {
        val listData = mutableListOf<Product>()
        val rawJsonData = context.getRawJson(filename)
        val typeTokenProduct = object : TypeToken<List<Product>>() {}.type
        val tempList: List<Product> = Gson().fromJson(rawJsonData, typeTokenProduct)
        listData.addAll(tempList)
        return listData
    }

}