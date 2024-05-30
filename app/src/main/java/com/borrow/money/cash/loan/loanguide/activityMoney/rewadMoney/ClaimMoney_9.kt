package com.borrow.money.cash.loan.loanguide.activityMoney.rewadMoney

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.activityMoney.descriptionMoney.DetailMoney_8
import com.borrow.money.cash.loan.loanguide.databinding.MoneyClaimBinding

class ClaimMoney_9 : AppCompatActivity() {
    private lateinit var mBinding: MoneyClaimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyClaimBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "Claim your reward"
//        NativeAdvanceCommonHelper().onAdLoad(
//            this,
//            mBinding.nativeContainer2,
//            null,
//            Constants.Screen9,
//            mBinding.bannerContainer, View.INVISIBLE,
//            mBinding.mediumNativeContainer, View.GONE,
//            null, View.GONE
//        )

        mBinding.conYourClaim.setOnClickListener {
            it.isEnabled = false
//            InterstitialHelperCommon().onAdShow(this,
//                object : InterstitialHelperCommon.InterstitialAdShowListener {
//
//                    override fun onAdComplete() {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@ClaimMoney_9, DetailMoney_8::class.java)
                                .putExtra("tag", "YourClaimStatus")
                                .putExtra("Five", "11")
                        )
//                    }
//                })
           

        }
        mBinding.conMember.setOnClickListener {
            it.isEnabled = false
//            InterstitialHelperCommon().onAdShow(this,
//                object : InterstitialHelperCommon.InterstitialAdShowListener {

//                    override fun onAdComplete() {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@ClaimMoney_9, DetailMoney_8::class.java)
                                .putExtra("tag", "Member Claim Status")
                                .putExtra("Five", "11")
                        )
//                    }
//                })
          

        }
        mBinding.conApply.setOnClickListener {
            it.isEnabled = false
//            InterstitialHelperCommon().onAdShow(this,
//                object : InterstitialHelperCommon.InterstitialAdShowListener {

//                    override fun onAdComplete() {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@ClaimMoney_9, DetailMoney_8::class.java)
                                .putExtra("tag", "Apply For Claim")
                                .putExtra("Five", "11")
                        )
//                    }
//                })
         

        }
        mBinding.conToolbar.btnBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
//        InterstitialHelperCommon().onBackAdShow(
//            this,
//            object : InterstitialHelperCommon.InterstitialAdShowListener {
//                override fun onAdComplete() {
                    finish()
//                }
//            })
    }
}