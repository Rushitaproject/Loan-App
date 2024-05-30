package com.borrow.money.cash.loan.loanguide.activityMoney.descriptionMoney

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.databinding.MoneyBankNameDataBinding

class BankNameDataMoney_31 : AppCompatActivity() {
    var TwentyEightNumber: String? = null
    var TwentyEightMini: String? = null
    var TwentyEightCare: String? = null
    private lateinit var mBinding: MoneyBankNameDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyBankNameDataBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "Bank Inform"

        TwentyEightNumber = intent.getStringExtra("TwentyEightNumber")
        TwentyEightMini = intent.getStringExtra("TwentyEightMini")
        TwentyEightCare = intent.getStringExtra("TwentyEightCare")
        mBinding.bbnumber.text = TwentyEightNumber
        mBinding.msnumber.text = TwentyEightMini
        mBinding.ccnumber.text = TwentyEightCare
        mBinding.conToolbar.btnBack.setOnClickListener {

            onBackPressed()
        }
    }

    override fun onBackPressed() {
                    finish()
    }
}