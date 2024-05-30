package com.borrow.money.cash.loan.loanguide.activityMoney.loantypeMoney

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.borrow.money.cash.loan.loanguide.adapterMoney.loantypeMoney.LoanMoneyAdapter
import com.borrow.money.cash.loan.loanguide.databinding.MoneyLoanTypeMoreBinding
import com.borrow.money.cash.loan.loanguide.model.LoanKind

class LoanTypeMoreMoney_15 : AppCompatActivity() {
    private lateinit var mBinding: MoneyLoanTypeMoreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyLoanTypeMoreBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "Type 0f Loan"

        val kindListing = ArrayList<LoanKind>()
        kindListing.add(LoanKind("What is Loan?"))
        kindListing.add(LoanKind("What purpose can it be used?"))
        kindListing.add(LoanKind("Which Eligibility criteria for used?"))
        kindListing.add(LoanKind("How much can one borrow?"))
        kindListing.add(LoanKind("From which back institution should one borrow?"))
        kindListing.add(LoanKind("How do bank decide on the maximum loan amount?"))
        kindListing.add(LoanKind("What are the common rates for loan?"))
        kindListing.add(LoanKind("Key document required when applying for a loan?"))
        kindListing.add(LoanKind("Difference between part payment, prepayment and preclosure"))
        kindListing.add(LoanKind("Loan approval process"))
        kindListing.add(LoanKind("Credit Report And Score"))
        kindListing.add(LoanKind("How is having a higher credit score beneficial?"))
        val loanTypeRV = LoanMoneyAdapter(kindListing)
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