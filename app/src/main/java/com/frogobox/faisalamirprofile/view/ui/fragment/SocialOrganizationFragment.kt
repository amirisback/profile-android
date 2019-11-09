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

class SocialOrganizationFragment : BaseFragment(), BaseRecyclerViewListener<SocialMedia> {

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
