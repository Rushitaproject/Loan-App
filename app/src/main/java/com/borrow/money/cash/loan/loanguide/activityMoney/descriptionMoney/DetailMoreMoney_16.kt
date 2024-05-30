package com.borrow.money.cash.loan.loanguide.activityMoney.descriptionMoney

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.R
import com.borrow.money.cash.loan.loanguide.databinding.MoneyDetailMoreBinding

class DetailMoreMoney_16 : AppCompatActivity() {
    private lateinit var mBinding: MoneyDetailMoreBinding
    var ThirteenPosition = 0
    var strThirteenData: String? = null
    var heading: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyDetailMoreBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "Information"

        if (intent != null) {
            ThirteenPosition = intent.getIntExtra("loan_type", 0)
            heading = intent.getStringExtra("heading")
        }
        when (ThirteenPosition) {
            0 -> strThirteenData = resources.getString(R.string.inform_1)
            1 -> strThirteenData = resources.getString(R.string.inform_2)
            2 -> strThirteenData = resources.getString(R.string.inform_3)
            3 -> strThirteenData = resources.getString(R.string.inform_4)
            4 -> strThirteenData = resources.getString(R.string.inform_5)
            5 -> strThirteenData = resources.getString(R.string.inform_6)
            6 -> strThirteenData = resources.getString(R.string.inform_7)
            7 -> strThirteenData = resources.getString(R.string.inform_8)
            8 -> strThirteenData = resources.getString(R.string.inform_9)
            9 -> strThirteenData = resources.getString(R.string.inform_10)
            10 -> strThirteenData = resources.getString(R.string.inform_11)
            11 -> strThirteenData = resources.getString(R.string.inform_12)
        }
        mBinding.tvDec1.text = strThirteenData
        mBinding.overview.setCharacterDelay(150)
        mBinding.overview.animateText(heading)
        mBinding.conToolbar.btnBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
                    finish()
    }
}