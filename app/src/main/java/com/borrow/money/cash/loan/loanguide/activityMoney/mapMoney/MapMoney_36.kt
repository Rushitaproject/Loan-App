package com.borrow.money.cash.loan.loanguide.activityMoney.mapMoney

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.databinding.MoneyMapBinding

class MapMoney_36 : AppCompatActivity() {
    private lateinit var mBinding: MoneyMapBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyMapBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)


        mBinding.conToolbar.heading.text = "Near By Me"
        mBinding.conAtm.setOnClickListener {
            val intent = Intent(
                "android.intent.action.VIEW",
                Uri.parse("https://www.google.co.in/maps/search/ATM")
            )
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
        mBinding.conZerox.setOnClickListener {
            val intent = Intent(
                "android.intent.action.VIEW",
                Uri.parse("https://www.google.co.in/maps/search/Zerox")
            )
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
        mBinding.conBank.setOnClickListener {
            val intent = Intent(
                "android.intent.action.VIEW",
                Uri.parse("https://www.google.co.in/maps/search/Bank")
            )
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
        mBinding.conToolbar.btnBack.setOnClickListener {

            onBackPressed()
        }
    }

    override fun onBackPressed() {
                    finish()
    }
}