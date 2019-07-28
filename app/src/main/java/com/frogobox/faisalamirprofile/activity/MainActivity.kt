package com.frogobox.faisalamirprofile.activity

import android.content.Intent
import android.nfc.NfcAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.helper.NFCUtil
import kotlinx.android.synthetic.main.activity_main_optional.*

class MainActivity : AppCompatActivity() {

    private var mNfcAdapter: NfcAdapter? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_optional)
        mNfcAdapter = NfcAdapter.getDefaultAdapter(this)

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


    override fun onResume() {
        super.onResume()
        mNfcAdapter?.let {
            NFCUtil.enableNFCInForeground(it, this, javaClass)
        }
    }

    override fun onPause() {
        super.onPause()
        mNfcAdapter?.let {
            NFCUtil.disableNFCInForeground(it, this)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        val messageWrittenSuccessfully = NFCUtil.createNFCMessage("Muhammad Faisal Amir", intent)
        if (messageWrittenSuccessfully) {
            Toast.makeText(this, "Successful Written to Tag", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Something When wrong Try Again", Toast.LENGTH_LONG).show()
        }
    }

}
