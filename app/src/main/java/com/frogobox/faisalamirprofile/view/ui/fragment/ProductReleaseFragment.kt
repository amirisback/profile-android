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
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_FROZEN_2048
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_HINDIA
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_INTELLIGENT_CLEANER
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_INTENTIONS
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_JAGO_SHOLAT
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_MOOD
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_MVVM
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_PIANO_K3
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_POKETMN_2048
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_PRAY_BOX
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_SPEECH_BOOSTER
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_STICKER_WA_POKETMN
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_VIPROX_VPN
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.PACKAGE_WALLPAPER_SW
import com.frogobox.faisalamirprofile.helper.ConstHelper.Link.URI_PLAY_STORE
import com.frogobox.faisalamirprofile.model.ProductOnline
import com.frogobox.faisalamirprofile.view.adapter.ProductAdapter
import com.frogobox.faisalamirprofile.view.adapter.ProductOnlineAdapter
import kotlinx.android.synthetic.main.fragment_product_child.*

class ProductReleaseFragment : BaseFragment(), BaseViewListener<ProductOnline> {

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

    private fun initArrayModel(): MutableList<ProductOnline> {

        val arrayProduct: MutableList<ProductOnline> = mutableListOf()

        arrayProduct.add(
            ProductOnline(
                getString(R.string.product_name_2048_elsa),
                "https://lh3.googleusercontent.com/CoHVl_g3EYa8G2YL-GxYOpU0Jsz5YOK1QnxXg25JTIcbUC7xWx1UVn5OxUI8sam_PnA=s180-rw",
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_FROZEN_2048"
            )
        )

        arrayProduct.add(
            ProductOnline(
                getString(R.string.product_name_2048_pokeeetmon),
                "https://lh3.googleusercontent.com/4I1DZQCKZQnk-Lz4h5Px-PDWq7VJDpz_7cPB9DqGV--glRA08kcjxWOkmyx3ZaZzEVkR=s180-rw",
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_POKETMN_2048"
            )
        )
        arrayProduct.add(
            ProductOnline(
                getString(R.string.product_name_intention),
                "https://lh3.googleusercontent.com/xIkkmULfdxH9F1a8BtjBArcFgy3S2QNUm2q177CLQ0Z4KidnLiGY-h3kvvRjKG2prZc=s180-rw",
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_INTENTIONS"
            )
        )

        arrayProduct.add(
            ProductOnline(
                getString(R.string.product_name_hindia),
                "https://lh3.googleusercontent.com/9Grcd0ECs8hrH9KooZrlmiMj3IlcA3efJ58nryKyb1S_s3nYnlUUImlrmO_QYC81oHw=s180-rw",
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_HINDIA"
            )
        )

        arrayProduct.add(
            ProductOnline(
                getString(R.string.product_name_praybox),
                "https://lh3.googleusercontent.com/bvwL2rSqsHXOGyb-x0qtDWAYSOISKpDyKAmlYlOJfrNn-OsZffbsVJXkThjxHI7fL4E=s180-rw",
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_PRAY_BOX"
            )
        )

        arrayProduct.add(
            ProductOnline(
                getString(R.string.product_name_sticker_wa_pokeeetmon),
                "https://lh3.googleusercontent.com/6m7YFf2U3WHfuXRCxGWlTOxuvfZlNEJcn5W82Kkt_tcTQ1U46cP_nce1AqXFiu9oIw=s180-rw",
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_STICKER_WA_POKETMN"
            )
        )

        arrayProduct.add(
            ProductOnline(
                getString(R.string.product_name_viprox_vpn),
                "https://lh3.googleusercontent.com/HvqIN5A-k0P7YemT-SYNfExv2KyNA8MBVTlGTTH6cwT26FicJvqvHiX7-DINMilHdA=s180-rw",
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_VIPROX_VPN"
            )
        )

        arrayProduct.add(
            ProductOnline(
                getString(R.string.product_name_cleaner),
                "https://lh3.googleusercontent.com/ylx7nChvYDwdiDYGneOb4RZHxtu6VWheV4alJyoI-r5KWaTEMrIWbK1SRg1-rme4ASY=s180-rw",
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_INTELLIGENT_CLEANER"
            )
        )
        arrayProduct.add(
            ProductOnline(
                getString(R.string.product_name_speech_booster),
                "https://lh3.googleusercontent.com/Elsk1cbKZVEoBgIE0tqH3363vyjma3OaaTYAF_sjdTsuFdzCdK-UPvQ560tUc6LaAVyS=s180-rw",
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_SPEECH_BOOSTER"
            )
        )

        arrayProduct.add(
            ProductOnline(
                getString(R.string.product_name_mood),
                "https://lh3.googleusercontent.com/RUrHpCAB-kOJZ6L84kGzSJIHjONF_eegy6t2qB3Lsgkdb7Lt9dkKk5gl2NXS9b5aIL4n=s180-rw",
                R.drawable.ic_product_type_release,
                 "$URI_PLAY_STORE$PACKAGE_MOOD"
            )
        )
        arrayProduct.add(
            ProductOnline(
                getString(R.string.product_name_jagosholat),
                "https://lh3.googleusercontent.com/x0tHfDXcylrXkyVVxVkauS_4l3-G8RES1049lOHaaYCSmwThVkthibTylOePcqCB_w=s180-rw",
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_JAGO_SHOLAT"
            )
        )

        arrayProduct.add(
            ProductOnline(
                getString(R.string.product_name_piano_k3g),
                "https://lh3.googleusercontent.com/YDwof5fu_tFJ0lbHLdgflrejZ6wnnygoDMF8j4ZlFUGCf8jCcM_KrqIuGQIXVbN-zNY=s180-rw",
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_PIANO_K3"
            )
        )
        arrayProduct.add(
            ProductOnline(
                getString(R.string.product_name_ayo_menghitung),
                "https://lh3.googleusercontent.com/XpI24XNtSDYx7u3GALI1RmmiQegW-IcZYXBgmBVaTNXSzfYowH_BRQGi9OBeqEDmfdI=s180-rw",
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_AYO_MENGHITUNG"
            )
        )

        arrayProduct.add(
            ProductOnline(
                getString(R.string.product_name_mvvm),
                "https://lh3.googleusercontent.com/FGtwWNAt7EBf8VxVpOzHIV9amUKsz6I9Oe8mTEcbjMUXLYV7-xulyQRLkevYkffbeQ=s180-rw",
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_MVVM"
            )
        )

        arrayProduct.add(
            ProductOnline(
                getString(R.string.product_name_dictionary_box),
                "https://lh3.googleusercontent.com/O7GtpkvKXUAFf9u8qqClL6NXS9twUbZFwonOFeoiriWIaIAyFbORQcCqtp0Xl8r_s2Y=s180-rw",
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_DICTIONARY_BOX"
            )
        )

        arrayProduct.add(
            ProductOnline(
                getString(R.string.product_name_wallpaper_sw),
                "https://lh3.googleusercontent.com/4Lps92vp2ow7lgcn7tYJESzTg9XakJUDkyvklC5GDsMawAV4O3m9EmClqwgOMO4ktg=s180-rw",
                R.drawable.ic_product_type_release,
                "$URI_PLAY_STORE$PACKAGE_WALLPAPER_SW"
            )
        )

        return arrayProduct

    }

    private fun initListView() {

        val adapter = ProductOnlineAdapter()
        adapter.setupRequirement(this, initArrayModel(), R.layout.item_product)
        rv_product.adapter = adapter
        rv_product.layoutManager = GridLayoutManager(context, 2)

    }

    override fun onItemClicked(data: ProductOnline) {
        data.productLink?.let { mActivity.baseStartExplicit(it) }
    }
    override fun onItemLongClicked(data: ProductOnline) {}

}
