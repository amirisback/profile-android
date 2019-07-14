package com.frogobox.faisalamirprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        fab_skill.setOnClickListener {
            val intentSkill = Intent(this, SkillActivity::class.java)
            startActivity(intentSkill)
        }

        fab_certificate.setOnClickListener {
            val intentCertificate = Intent(this, CertificateActivity::class.java)
            startActivity(intentCertificate)
        }

        fab_social_media.setOnClickListener {
            val intentSocialMedia = Intent(this, SocialMediaActivity::class.java)
            startActivity(intentSocialMedia)
        }


    }
}
