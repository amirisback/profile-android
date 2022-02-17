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

    private fun getJsonAssets(context: Context, filename: String): String? {
        val jsonString: String
        try {
            jsonString = context.assets.open(filename).bufferedReader().use { it.readText() }
        } catch (ioException: IOException) {
            ioException.printStackTrace()
            return null
        }
        return jsonString
    }

    fun listProduct(context: Context, filename: String): MutableList<Product> {
        val listData = mutableListOf<Product>()
        val rawJsonData = getJsonAssets(context, filename)
        val typeTokenProduct = object : TypeToken<List<Product>>() {}.type
        val tempList: List<Product> = Gson().fromJson(rawJsonData, typeTokenProduct)
        listData.addAll(tempList)
        return listData
    }

    fun getDrawableString(context: Context, nameResource: String): Int {
        return context.getResources()
            .getIdentifier(nameResource, "drawable", context.getPackageName());
    }

}