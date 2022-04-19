package com.frogobox.faisalamirprofile.mvvm.product

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.frogobox.faisalamirprofile.core.BaseFragment
import com.frogobox.faisalamirprofile.databinding.FragmentProductChildBinding
import com.frogobox.faisalamirprofile.databinding.ItemProductBinding
import com.frogobox.faisalamirprofile.model.Product
import com.frogobox.faisalamirprofile.util.FuncHelper
import com.frogobox.recycler.core.FrogoRecyclerNotifyListener
import com.frogobox.recycler.core.IFrogoBindingAdapter

class ProductDebugFragment : BaseFragment<FragmentProductChildBinding>() {

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentProductChildBinding {
        return FragmentProductChildBinding.inflate(inflater, container, false)
    }

    override fun setupViewModel() {
    }

    override fun setupOnViewCreated(view: View, savedInstanceState: Bundle?) {
        initListView()
    }

    private fun listProduct(): MutableList<Product>? {
        return context?.let { FuncHelper.listProduct(it, "product_debug.json") }
    }

    private fun initListView() {

        val callback = object : IFrogoBindingAdapter<Product, ItemProductBinding> {
            override fun onItemClicked(
                binding: ItemProductBinding,
                data: Product,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Product>
            ) {
                mActivity.baseStartExplicit(data.link)
            }

            override fun onItemLongClicked(
                binding: ItemProductBinding,
                data: Product,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Product>
            ) {
            }

            override fun setViewBinding(parent: ViewGroup): ItemProductBinding {
                return ItemProductBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            }

            override fun setupInitComponent(
                binding: ItemProductBinding,
                data: Product,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Product>
            ) {
                Glide.with(mActivity).load(FuncHelper.getDrawableString(mActivity, data.icon))
                    .into(binding.imgProductIcon)
                binding.tvProductName.text = data.name
            }
        }

        binding.apply {
            rvProduct.injectorBinding<Product, ItemProductBinding>()
                .addData(listProduct()!!)
                .addCallback(callback)
                .createLayoutGrid(2)
                .build()
        }

    }

}