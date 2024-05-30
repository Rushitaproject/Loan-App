package com.borrow.money.cash.loan.loanguide.activityMoney.cardMoney

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.borrow.money.cash.loan.loanguide.adapterMoney.loantypeMoney.CreditCardMoneyAdapter
import com.borrow.money.cash.loan.loanguide.databinding.MoneyCreditCardBinding
import com.borrow.money.cash.loan.loanguide.model.LoanKind

class CreditCardMoney_22 : AppCompatActivity() {
    private lateinit var mBinding: MoneyCreditCardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyCreditCardBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "CreditCard Loan advise"

        val kindListing = ArrayList<LoanKind>()
        kindListing.add(LoanKind("What is a Loan on Credit Card?"))
        kindListing.add(LoanKind("Features of a Loan on Credit Card"))
        kindListing.add(LoanKind("Eligibility for Loans on Credit Card?"))
        kindListing.add(LoanKind("Advantages of a Loan on Credit Card?"))
        val loanTypeRV = CreditCardMoneyAdapter(kindListing)
        val gridLayoutManager = GridLayoutManager(this, 1)
        mBinding.recyclerLoanType.setHasFixedSize(true)
        mBinding.recyclerLoanType.layoutManager = gridLayoutManager
        mBinding.recyclerLoanType.adapter = loanTypeRV
        mBinding.conToolbar.btnBack.setOnClickListener {

            onBackPressed()
        }
    }

    override fun onBackPressed() {
                    finish()
    }
}