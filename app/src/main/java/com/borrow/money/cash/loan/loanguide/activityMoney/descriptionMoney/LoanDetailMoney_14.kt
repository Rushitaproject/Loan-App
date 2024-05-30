package com.borrow.money.cash.loan.loanguide.activityMoney.descriptionMoney

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.databinding.MoneyLoanDetailBinding

class LoanDetailMoney_14 : AppCompatActivity() {
    private lateinit var mBinding: MoneyLoanDetailBinding
    var jsonTwelve: String? = null
    var jsonlinkTwelve: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyLoanDetailBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "Loan advise"

        jsonlinkTwelve = intent.extras!!.getString("jsonlink")
        jsonTwelve = intent.extras!!.getString("jsonname")
        mBinding.overview.setCharacterDelay(150)
        mBinding.overview.animateText(jsonTwelve)
        mBinding.textRegininfo.text = jsonlinkTwelve
        mBinding.conToolbar.btnBack.setOnClickListener {

            onBackPressed()
        }
    }

    override fun onBackPressed() {
                    finish()
    }
}