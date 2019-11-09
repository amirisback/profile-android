package com.frogobox.faisalamirprofile.view.ui.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.view.adapter.ProductAdapter
import com.frogobox.faisalamirprofile.base.BaseFragment
import com.frogobox.faisalamirprofile.model.Product
import kotlinx.android.synthetic.main.fragment_product.*


class ProductFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListView()
    }

    private fun initListView(){
        val arrayProduct : MutableList<Product> = mutableListOf()

        arrayProduct.add(
            Product(getString(R.string.product_name_cat),
                R.drawable.ic_product_cat,
                R.drawable.ic_product_type_android
            )
        )
        arrayProduct.add(
            Product(getString(R.string.product_name_finpro),
                R.drawable.ic_product_finpro,
                R.drawable.ic_product_type_android
            )
        )
        arrayProduct.add(
            Product(getString(R.string.product_name_football),
                R.drawable.ic_product_football,
                R.drawable.ic_product_type_android
            )
        )
        arrayProduct.add(
            Product(getString(R.string.product_name_frogonews),
                R.drawable.ic_product_frogonews,
                R.drawable.ic_product_type_android
            )
        )
        arrayProduct.add(
            Product(getString(R.string.product_name_jagosholat),
                R.drawable.ic_product_jagosholat,
                R.drawable.ic_product_type_android
            )
        )
        arrayProduct.add(
            Product(getString(R.string.product_name_jami),
                R.drawable.ic_product_jami,
                R.drawable.ic_product_type_android
            )
        )
        arrayProduct.add(
            Product(getString(R.string.product_name_movie),
                R.drawable.ic_product_movie,
                R.drawable.ic_product_type_android
            )
        )
        arrayProduct.add(
            Product(getString(R.string.product_name_mood),
                R.drawable.ic_product_mood,
                R.drawable.ic_product_type_android
            )
        )
        arrayProduct.add(
            Product(getString(R.string.product_name_romis),
                R.drawable.ic_product_romis,
                R.drawable.ic_product_type_android
            )
        )
        arrayProduct.add(
            Product(getString(R.string.product_name_shejek),
                R.drawable.ic_product_shejek,
                R.drawable.ic_product_type_android
            )
        )

        val adapter = ProductAdapter(context, arrayProduct)
        val mLayoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL ,false)

        rv_product.adapter = adapter
        rv_product.layoutManager = mLayoutManager
    }

}
