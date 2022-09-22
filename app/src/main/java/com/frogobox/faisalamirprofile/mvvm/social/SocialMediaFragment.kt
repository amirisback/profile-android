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

class SocialMediaFragment : BaseFragment<FragmentSocialBinding>() {

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
                R.drawable.img_logo_linkedin,
                getString(R.string.text_link_linkedin)
            )
        )
        arraySocialMedia.add(
            SocialMedia(
                R.drawable.img_logo_github,
                getString(R.string.text_link_github)
            )
        )
        arraySocialMedia.add(
            SocialMedia(
                R.drawable.img_logo_dribbble,
                getString(R.string.text_link_dribbble)
            )
        )
        arraySocialMedia.add(
            SocialMedia(
                R.drawable.img_logo_medium,
                getString(R.string.text_link_medium)
            )
        )
        arraySocialMedia.add(
            SocialMedia(
                R.drawable.img_logo_playstore,
                getString(R.string.text_link_playstore)
            )
        )
        arraySocialMedia.add(
            SocialMedia(
                R.drawable.img_logo_facebook,
                getString(R.string.text_link_facebook)
            )
        )
        arraySocialMedia.add(
            SocialMedia(
                R.drawable.img_logo_instagram,
                getString(R.string.text_link_instagram)
            )
        )
        arraySocialMedia.add(
            SocialMedia(
                R.drawable.img_logo_twitter,
                getString(R.string.text_link_twitter)
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