package com.frogobox.faisalamirprofile.view.ui.activity

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.base.BaseActivity
import com.frogobox.faisalamirprofile.model.SocialMedia
import com.frogobox.faisalamirprofile.view.adapter.SocialMediaAdapter
import com.frogobox.speechbooster.base.view.BaseRecyclerViewListener
import kotlinx.android.synthetic.main.activity_social_media.*

class SocialMediaActivity : BaseActivity(), BaseRecyclerViewListener<SocialMedia> {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social_media)
        setupDetailActivity("")
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
        val mLayoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)


        adapter.setRecyclerViewLayout(this, R.layout.item_social_media)
        adapter.setRecyclerViewListener(this)
        adapter.setRecyclerViewData(initArrayModel())

        rv_social_media.adapter = adapter
        rv_social_media.layoutManager = mLayoutManager
    }

    override fun onItemClicked(data: SocialMedia) {}
    override fun onItemLongClicked(data: SocialMedia) {}


}
