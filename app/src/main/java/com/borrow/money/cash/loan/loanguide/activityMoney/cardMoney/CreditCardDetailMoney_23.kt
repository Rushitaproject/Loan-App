package com.borrow.money.cash.loan.loanguide.activityMoney.cardMoney

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.R
import com.borrow.money.cash.loan.loanguide.databinding.MoneyCreditCardDetailBinding

class CreditCardDetailMoney_23 : AppCompatActivity() {
    private lateinit var mBinding: MoneyCreditCardDetailBinding
    var TwentyTwoPos = 0
    var TwentyTwodata: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyCreditCardDetailBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)


        mBinding.conToolbar.heading.text = "Credit Card advise"

        if (intent != null) {
            TwentyTwoPos = intent.getIntExtra("TwentyTwoType", 0)
        }
        when (TwentyTwoPos) {
            0 -> TwentyTwodata = resources.getString(R.string.card)
            1 -> TwentyTwodata = resources.getString(R.string.card1)
            2 -> TwentyTwodata = resources.getString(R.string.card2)
            3 -> TwentyTwodata = resources.getString(R.string.card3)
        }
        mBinding.tvDec1.text = TwentyTwodata
        mBinding.conToolbar.btnBack.setOnClickListener {

            onBackPressed()
        }
    }

    override fun onBackPressed() {
                    finish()
    }
}