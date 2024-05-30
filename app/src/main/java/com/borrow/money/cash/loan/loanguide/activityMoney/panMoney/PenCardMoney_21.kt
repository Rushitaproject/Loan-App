package com.borrow.money.cash.loan.loanguide.activityMoney.panMoney

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.R
import com.borrow.money.cash.loan.loanguide.databinding.MoneyPenCardBinding

class PenCardMoney_21 : AppCompatActivity() {
    private lateinit var mBinding: MoneyPenCardBinding
    var NineteenPostion = 0
    var NineteenData: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyPenCardBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "Pan Card advise"

        if (intent != null) {
            NineteenPostion = intent.getIntExtra("NineteenType", 0)
        }
        when (NineteenPostion) {
            0 -> NineteenData = resources.getString(R.string.pancard)
            1 -> NineteenData = resources.getString(R.string.pancard1)
            2 -> NineteenData = resources.getString(R.string.pancard2)
            3 -> NineteenData = resources.getString(R.string.pancard3)
            4 -> NineteenData = resources.getString(R.string.pancard4)
            5 -> NineteenData = resources.getString(R.string.pancard5)
            6 -> NineteenData = resources.getString(R.string.pancard6)
            7 -> NineteenData = resources.getString(R.string.pancard7)
            8 -> NineteenData = resources.getString(R.string.pancard8)
            9 -> NineteenData = resources.getString(R.string.pancard9)
            10 -> NineteenData = resources.getString(R.string.pancard10)
            11 -> NineteenData = resources.getString(R.string.pancard11)
            12 -> NineteenData = resources.getString(R.string.pancard12)
            13 -> NineteenData = resources.getString(R.string.pancard13)
            14 -> NineteenData = resources.getString(R.string.pancard14)
            15 -> NineteenData = resources.getString(R.string.pancard15)
            16 -> NineteenData = resources.getString(R.string.pancard16)
            17 -> NineteenData = resources.getString(R.string.pancard17)
            18 -> NineteenData = resources.getString(R.string.pancard18)
            19 -> NineteenData = resources.getString(R.string.pancard19)
            20 -> NineteenData = resources.getString(R.string.pancard20)
        }
        mBinding.tvDec1.text = NineteenData
        mBinding.conToolbar.btnBack.setOnClickListener {

            onBackPressed()
        }
    }

    override fun onBackPressed() {
                    finish()
    }
}