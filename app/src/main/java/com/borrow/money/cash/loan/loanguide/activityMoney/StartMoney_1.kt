package com.borrow.money.cash.loan.loanguide.activityMoney


import android.app.Dialog
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.R
import com.borrow.money.cash.loan.loanguide.adhelperMoney.SharedPrefs
import com.borrow.money.cash.loan.loanguide.databinding.MoneyStartBinding
import com.borrow.money.cash.loan.loanguide.introMoney.IntroOneMoney_2
import com.borrow.money.cash.loan.loanguide.introMoney.IntroTwoMoney_3
import com.google.android.material.button.MaterialButton

class StartMoney_1 : AppCompatActivity() {
    private lateinit var mBinding: MoneyStartBinding
    val array = intArrayOf(R.string.headline1, R.string.headline2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyStartBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.btnStart.setOnClickListener {
            it.isEnabled = true
            if (!SharedPrefs.getBoolean(this@StartMoney_1, "isCountry")) {
                startActivity(
                    Intent(
                        this@StartMoney_1,
                        IntroOneMoney_2::class.java
                    )
                )
            } else if (!SharedPrefs.getBoolean(this@StartMoney_1, "isCurrency")) {
                startActivity(
                    Intent(
                        this@StartMoney_1,
                        IntroTwoMoney_3::class.java
                    )
                )
            } else {
                startActivity(
                    Intent(
                        this@StartMoney_1,
                        HomeMoney_4::class.java
                    )
                )
            }


        }

    }

    override fun onBackPressed() {
        startExit()
    }


    private fun startExit() {
        val dialog = Dialog(this)
        dialog.setCancelable(false)
        dialog.requestWindowFeature(1)
        dialog.window!!.requestFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.dialog_exit)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(0))
        dialog.setCanceledOnTouchOutside(false)
        val tvOk = dialog.findViewById<MaterialButton>(R.id.btn_yes)
        val tvCancel = dialog.findViewById<MaterialButton>(R.id.btn_no)
        tvOk.setOnClickListener {
            finishAffinity()
            dialog.dismiss()
        }
        tvCancel.setOnClickListener { dialog.dismiss() }
        val window = dialog.window
        window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        dialog.show()
    }

}