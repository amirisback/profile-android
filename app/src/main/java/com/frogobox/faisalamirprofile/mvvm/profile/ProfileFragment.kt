package com.frogobox.faisalamirprofile.mvvm.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.frogobox.faisalamirprofile.core.BaseFragment
import com.frogobox.faisalamirprofile.databinding.FragmentProfileBinding
import com.frogobox.faisalamirprofile.mvvm.social.SocialActivity
import com.frogobox.sdk.ext.glideLoad

class ProfileFragment : BaseFragment<FragmentProfileBinding>() {

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentProfileBinding {
        return FragmentProfileBinding.inflate(inflater, container, false)
    }

    override fun setupViewModel() {
    }

    override fun onViewCreatedExt(view: View, savedInstanceState: Bundle?) {
        super.onViewCreatedExt(view, savedInstanceState)
        binding.apply {
            ivPhoto.glideLoad("https://avatars1.githubusercontent.com/u/24654871?s=460&u=a93f6b361640532acbe98b0c4ba60a83f50c768e&v=4")

            fabSocialMedia.setOnClickListener {
                frogoStartActivity<SocialActivity>()
            }
        }
    }

}
