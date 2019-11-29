package com.frogobox.faisalamirprofile.view.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.base.adapter.BaseViewListener
import com.frogobox.faisalamirprofile.base.ui.BaseFragment
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_AYO_MENGHITUNG
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_DICTIONARY_BOX
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_INTELLIGENT_CLEANER
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_JAGO_SHOLAT
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_MOOD
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_MVVM
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_PIANO_K3
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_SPEECH_BOOSTER
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.URI_PLAY_STORE
import com.frogobox.faisalamirprofile.model.Product
import com.frogobox.faisalamirprofile.view.adapter.ProductAdapter
import kotlinx.android.synthetic.main.fragment_product_child.*

class ProductReleaseFragment : BaseFragment(), BaseViewListener<Product> {

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
                getString(R.string.product_name_cleaner),
                R.drawable.ic_product_cleaner,
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_INTELLIGENT_CLEANER"
            )
        )
        arrayProduct.add(
            Product(
                getString(R.string.product_name_speech_booster),
                R.drawable.ic_product_speech_booster,
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_SPEECH_BOOSTER"
            )
        )

        arrayProduct.add(
            Product(
                getString(R.string.product_name_mood),
                R.drawable.ic_product_mood,
                R.drawable.ic_product_type_release,
                 "$URI_PLAY_STORE$PACKAGE_MOOD"
            )
        )
        arrayProduct.add(
            Product(
                getString(R.string.product_name_jagosholat),
                R.drawable.ic_product_jagosholat,
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_JAGO_SHOLAT"
            )
        )

        arrayProduct.add(
            Product(
                getString(R.string.product_name_piano_k3g),
                R.drawable.ic_product_piano_k3g,
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_PIANO_K3"
            )
        )
        arrayProduct.add(
            Product(
                getString(R.string.product_name_ayo_menghitung),
                R.drawable.ic_product_ayomenghitung,
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_AYO_MENGHITUNG"
            )
        )

        arrayProduct.add(
            Product(
                getString(R.string.product_name_mvvm),
                R.drawable.ic_product_mvvm,
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_MVVM"
            )
        )
        arrayProduct.add(
            Product(
                getString(R.string.product_name_dictionary_box),
                R.drawable.ic_product_dictionary_box,
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_DICTIONARY_BOX"
            )
        )


        return arrayProduct

    }

    private fun initListView() {

        val adapter = ProductAdapter()
        adapter.setupRequirement(this, initArrayModel(), R.layout.item_product)
        rv_product.adapter = adapter
        rv_product.layoutManager = GridLayoutManager(context, 2)

    }

    override fun onItemClicked(data: Product) {
        data.productLink?.let { mActivity.baseStartExplicit(it) }
    }
    override fun onItemLongClicked(data: Product) {}

}
