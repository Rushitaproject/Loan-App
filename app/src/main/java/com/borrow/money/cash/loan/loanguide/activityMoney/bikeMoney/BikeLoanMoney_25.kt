package com.borrow.money.cash.loan.loanguide.activityMoney.bikeMoney

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.R
import com.borrow.money.cash.loan.loanguide.databinding.MoneyBikeLoanBinding

class BikeLoanMoney_25 : AppCompatActivity() {
    private lateinit var mBinding: MoneyBikeLoanBinding
    var TwentyFourPostion = 0
    var TStrData: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyBikeLoanBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)


        mBinding.conToolbar.heading.text = "Bike Loan advise"
        if (intent != null) {
            TwentyFourPostion = intent.getIntExtra("TwentyFourType", 0)
        }
        when (TwentyFourPostion) {
            0 -> TStrData = resources.getString(R.string.bike)
            1 -> TStrData = resources.getString(R.string.bike1)
        }
        mBinding.tvDec1.text = TStrData
        mBinding.conToolbar.btnBack.setOnClickListener {

            onBackPressed()
        }
    }

    override fun onBackPressed() {
                    finish()
    }
}