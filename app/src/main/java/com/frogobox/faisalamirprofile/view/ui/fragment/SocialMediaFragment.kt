package com.frogobox.faisalamirprofile.view.ui.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.base.BaseFragment
import com.frogobox.faisalamirprofile.model.SocialMedia
import com.frogobox.faisalamirprofile.view.adapter.SocialMediaAdapter
import com.frogobox.speechbooster.base.view.BaseRecyclerViewListener
import kotlinx.android.synthetic.main.fragment_social.*


class SocialMediaFragment : BaseFragment(), BaseRecyclerViewListener<SocialMedia> {

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

        val adapter = SocialMediaAdapter()
        val mLayoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        context?.let { adapter.setRecyclerViewLayout(it, R.layout.item_social_media) }
        adapter.setRecyclerViewListener(this)
        adapter.setRecyclerViewData(initArrayModel())

        rv_social_media.adapter = adapter
        rv_social_media.layoutManager = mLayoutManager
    }

    override fun onItemClicked(data: SocialMedia) {}
    override fun onItemLongClicked(data: SocialMedia) {}

}
