package com.frogobox.faisalamirprofile.view.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.base.ui.BaseFragment
import com.frogobox.faisalamirprofile.model.Product
import com.frogobox.faisalamirprofile.util.FuncHelper
import com.frogobox.recycler.boilerplate.adapter.callback.FrogoAdapterCallback
import kotlinx.android.synthetic.main.fragment_product_child.*
import kotlinx.android.synthetic.main.item_product.view.*

class ProductReleaseFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product_child, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListView()
    }

    private fun listProduct(): MutableList<Product>? {
        return context?.let { FuncHelper.listProduct(it, "product_release.json") }
    }

    private fun initListView() {

        val adapterCallback = object : FrogoAdapterCallback<Product> {
            override fun onItemClicked(data: Product) {
                mActivity.baseStartExplicit(data.link)
            }

            override fun onItemLongClicked(data: Product) {}

            override fun setupInitComponent(view: View, data: Product) {
                Glide.with(view.context).load(data.icon).into(view.img_product_icon)
                view.tv_product_name.text = data.name
                view.tv_product_name.setCompoundDrawablesWithIntrinsicBounds(
                    FuncHelper.getDrawableString(
                        view.context,
                        data.type
                    ), 0, 0, 0
                )
            }
        }

        rv_product.injector<Product>()
            .addData(listProduct()!!)
            .addCustomView(R.layout.item_product)
            .addEmptyView(null)
            .addCallback(adapterCallback)
            .createLayoutGrid(2)
            .createAdapter()
            .build(rv_product)

    }

}
