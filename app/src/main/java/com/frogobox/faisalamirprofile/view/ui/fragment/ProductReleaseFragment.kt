package com.frogobox.faisalamirprofile.view.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.base.BaseFragment
import com.frogobox.faisalamirprofile.model.Product
import com.frogobox.faisalamirprofile.view.adapter.ProductAdapter
import com.frogobox.speechbooster.base.view.BaseRecyclerViewListener
import kotlinx.android.synthetic.main.fragment_product_child.*

class ProductReleaseFragment : BaseFragment(), BaseRecyclerViewListener<Product> {

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

    private fun initArrayModel(): MutableList<Product> {

        val arrayProduct: MutableList<Product> = mutableListOf()

        arrayProduct.add(
            Product(
                getString(R.string.product_name_mood),
                R.drawable.ic_product_mood,
                R.drawable.img_logo_playstore
            )
        )
        arrayProduct.add(
            Product(
                getString(R.string.product_name_jagosholat),
                R.drawable.ic_product_jagosholat,
                R.drawable.img_logo_playstore
            )
        )

        return arrayProduct

    }

    private fun initListView() {

        val adapter = ProductAdapter()
        context?.let { adapter.setRecyclerViewLayout(it, R.layout.item_product) }
        adapter.setRecyclerViewListener(this)
        adapter.setRecyclerViewData(initArrayModel())
        rv_product.adapter = adapter
        rv_product.layoutManager = GridLayoutManager(context, 2)

    }

    override fun onItemClicked(data: Product) {}
    override fun onItemLongClicked(data: Product) {}

}
