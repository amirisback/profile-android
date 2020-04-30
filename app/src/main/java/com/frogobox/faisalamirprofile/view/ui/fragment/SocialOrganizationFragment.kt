package com.frogobox.faisalamirprofile.view.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.base.ui.BaseFragment
import com.frogobox.faisalamirprofile.model.SocialMedia
import com.frogobox.recycler.boilerplate.viewrclass.FrogoViewAdapterCallback
import kotlinx.android.synthetic.main.fragment_social.*
import kotlinx.android.synthetic.main.item_social_media.view.*

class SocialOrganizationFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_social, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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

        val adapterCallback = object : FrogoViewAdapterCallback<SocialMedia> {
            override fun onItemClicked(data: SocialMedia) {}

            override fun onItemLongClicked(data: SocialMedia) {}

            override fun setupInitComponent(view: View, data: SocialMedia) {
                view.img_icon.setImageResource(data.icon)
                view.tv_link.text = data.link
            }
        }

        rv_social_media.injector<SocialMedia>()
            .addData(initArrayModel())
            .addCustomView(R.layout.item_social_media)
            .addEmptyView(null)
            .addCallback(adapterCallback)
            .createLayoutLinearVertical(false)
            .build()

    }

}
