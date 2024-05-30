package com.borrow.money.cash.loan.loanguide.activityMoney.descriptionMoney

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.R
import com.borrow.money.cash.loan.loanguide.databinding.MoneyLoanTypeDetailBinding

class LoanTypeDetailMoney_6 : AppCompatActivity() {
    private lateinit var mBinding: MoneyLoanTypeDetailBinding
    private var position = 0
    private var description: String? = null
    var name: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyLoanTypeDetailBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "Information"

        if (intent != null) {
            position = intent.getIntExtra("LoanTypes", 0)
            name = intent.getStringExtra("description")
        }
        when (position) {
            0 -> description = resources.getString(R.string.InstantLoanadvise1)
            1 -> description = resources.getString(R.string.InstantLoanadvise2)
            2 -> description = resources.getString(R.string.InstantLoanadvise3)
            3 -> description = resources.getString(R.string.InstantLoanadvise4)
            4 -> description = resources.getString(R.string.InstantLoanadvise5)
            5 -> description = resources.getString(R.string.InstantLoanadvise6)
        }
        mBinding.txtTitle.text = description
        mBinding.overview.setCharacterDelay(150)
        mBinding.overview.animateText(name)
        mBinding.conToolbar.btnBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
                    finish()
    }
}