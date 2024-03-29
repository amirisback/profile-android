package com.frogobox.faisalamirprofile.mvvm.social

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.core.BaseFragment
import com.frogobox.faisalamirprofile.databinding.FragmentSocialBinding
import com.frogobox.faisalamirprofile.databinding.ItemSocialMediaBinding
import com.frogobox.faisalamirprofile.model.SocialMedia
import com.frogobox.recycler.core.FrogoRecyclerNotifyListener
import com.frogobox.recycler.core.IFrogoBindingAdapter

class SocialOrganizationFragment : BaseFragment<FragmentSocialBinding>() {

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentSocialBinding {
        return FragmentSocialBinding.inflate(inflater, container, false)
    }

    override fun setupViewModel() {
    }

    override fun onViewCreatedExt(view: View, savedInstanceState: Bundle?) {
        super.onViewCreatedExt(view, savedInstanceState)
        initListView()
    }

    private fun initArrayModel(): MutableList<SocialMedia> {
        val arraySocialMedia: MutableList<SocialMedia> = mutableListOf()

        arraySocialMedia.add(
            SocialMedia(
                R.drawable.img_logo_org_uxid,
                getString(R.string.title_org_uxid)
            )
        )

        arraySocialMedia.add(
            SocialMedia(
                R.drawable.img_logo_org_ypgeek,
                getString(R.string.title_org_ypgeek)
            )
        )

        arraySocialMedia.add(
            SocialMedia(
                R.drawable.img_logo_org_himadif,
                getString(R.string.title_org_himadif)
            )
        )

        arraySocialMedia.add(
            SocialMedia(
                R.drawable.img_logo_org_protect,
                getString(R.string.title_org_protect)
            )
        )

        return arraySocialMedia
    }

    private fun initListView() {

        val callback = object : IFrogoBindingAdapter<SocialMedia, ItemSocialMediaBinding> {
            override fun onItemClicked(
                binding: ItemSocialMediaBinding,
                data: SocialMedia,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<SocialMedia>,
            ) {
            }

            override fun onItemLongClicked(
                binding: ItemSocialMediaBinding,
                data: SocialMedia,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<SocialMedia>,
            ) {
            }

            override fun setViewBinding(parent: ViewGroup): ItemSocialMediaBinding {
                return ItemSocialMediaBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            }

            override fun setupInitComponent(
                binding: ItemSocialMediaBinding,
                data: SocialMedia,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<SocialMedia>,
            ) {
                binding.imgIcon.setImageResource(data.icon)
                binding.tvLink.text = data.link
            }
        }

        binding.apply {
            rvSocialMedia.injectorBinding<SocialMedia, ItemSocialMediaBinding>()
                .addData(initArrayModel())
                .addCallback(callback)
                .createLayoutLinearVertical(false)
                .build()
        }

    }

}
