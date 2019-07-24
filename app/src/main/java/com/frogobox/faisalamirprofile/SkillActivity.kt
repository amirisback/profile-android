package com.frogobox.faisalamirprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.frogobox.faisalamirprofile.adapter.ProductAdapter
import com.frogobox.faisalamirprofile.model.Product
import kotlinx.android.synthetic.main.activity_skill.*
import kotlinx.android.synthetic.main.container_title.*

class SkillActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        initView()

    }


    private fun initView(){
        tv_content_title.text = getString(R.string.title_skill)
        tv_content_subtitle.text = getString(R.string.subtitle_skill)
        initListView()
    }

    private fun initListView(){
        val arrayProduct : MutableList<Product> = mutableListOf()

        arrayProduct.add(Product(getString(R.string.product_name_cat), R.drawable.ic_product_cat, R.drawable.ic_product_type_android))
        arrayProduct.add(Product(getString(R.string.product_name_finpro), R.drawable.ic_product_finpro, R.drawable.ic_product_type_android))
        arrayProduct.add(Product(getString(R.string.product_name_football), R.drawable.ic_product_football, R.drawable.ic_product_type_android))
        arrayProduct.add(Product(getString(R.string.product_name_frogonews), R.drawable.ic_product_frogonews, R.drawable.ic_product_type_android))
        arrayProduct.add(Product(getString(R.string.product_name_jagosholat), R.drawable.ic_product_jagosholat, R.drawable.ic_product_type_android))
        arrayProduct.add(Product(getString(R.string.product_name_jami), R.drawable.ic_product_jami, R.drawable.ic_product_type_android))
        arrayProduct.add(Product(getString(R.string.product_name_movie), R.drawable.ic_product_movie, R.drawable.ic_product_type_android))
        arrayProduct.add(Product(getString(R.string.product_name_mood), R.drawable.ic_product_mood, R.drawable.ic_product_type_android))
        arrayProduct.add(Product(getString(R.string.product_name_romis), R.drawable.ic_product_romis, R.drawable.ic_product_type_android))
        arrayProduct.add(Product(getString(R.string.product_name_shejek), R.drawable.ic_product_shejek, R.drawable.ic_product_type_android))

        val adapter = ProductAdapter(this, arrayProduct)
        val mLayoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL ,false)

        rv_product.adapter = adapter
        rv_product.layoutManager = mLayoutManager
    }


}
