package com.borrow.money.cash.loan.loanguide.activityMoney.aadharMoney

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.R

import com.borrow.money.cash.loan.loanguide.databinding.MoneyAadharInfoBinding

class AAdharInfoMoney_19 : AppCompatActivity() {
    private lateinit var mBinding: MoneyAadharInfoBinding
    var EighteenPosition = 0
    var EighteenData: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyAadharInfoBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)
        settingUpTextInput()
        handleClickEvent()
    }

    private fun settingUpTextInput() {
        mBinding.conToolbar.heading.text = "AAdhar advise"
        if (intent != null) {
            EighteenPosition = intent.getIntExtra("EighteenType", 0)
        }
        when (EighteenPosition) {
            0 -> EighteenData = resources.getString(R.string.aadhar)
            1 -> EighteenData = resources.getString(R.string.aadhar1)
            2 -> EighteenData = resources.getString(R.string.aadhar2)
            3 -> EighteenData = resources.getString(R.string.aadhar3)
            4 -> EighteenData = resources.getString(R.string.aadhar4)
            5 -> EighteenData = resources.getString(R.string.aadhar5)
            6 -> EighteenData = resources.getString(R.string.aadhar6)
            7 -> EighteenData = resources.getString(R.string.aadhar7)
            8 -> EighteenData = resources.getString(R.string.aadhar8)
            9 -> EighteenData = resources.getString(R.string.aadhar9)
            10 -> EighteenData = resources.getString(R.string.aadhar10)
        }
        mBinding.tvDec1.text = EighteenData
    }

    private fun handleClickEvent() {
        mBinding.conToolbar.btnBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
                    finish()
    }
}