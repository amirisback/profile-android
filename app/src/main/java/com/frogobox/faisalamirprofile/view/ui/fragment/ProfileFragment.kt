package com.frogobox.faisalamirprofile.view.ui.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.base.ui.BaseFragment
import com.frogobox.faisalamirprofile.view.ui.activity.SocialActivity
import kotlinx.android.synthetic.main.fragment_profile.*


class ProfileFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Glide.with(mActivity)
            .load("https://avatars1.githubusercontent.com/u/24654871?s=460&u=a93f6b361640532acbe98b0c4ba60a83f50c768e&v=4")
            .into(iv_photo)

        fab_social_media.setOnClickListener {
            baseStartActivity<SocialActivity>()
        }
    }


}
