package com.borrow.money.cash.loan.loanguide.activityMoney.loantypeMoney

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.borrow.money.cash.loan.loanguide.R
import com.borrow.money.cash.loan.loanguide.adapterMoney.loantypeMoney.CommonTypeMoneyAdapter
import com.borrow.money.cash.loan.loanguide.databinding.MoneyLoanTypeBinding
import com.borrow.money.cash.loan.loanguide.model.TypesOfLoan

class LoanTypeMoney_5 : AppCompatActivity() {
    private lateinit var mBinding: MoneyLoanTypeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyLoanTypeBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "Borrow Money Loan Types"

        val typesListing = ArrayList<TypesOfLoan>()
        typesListing.add(TypesOfLoan(R.drawable.home_loan, "Home Loan"))
        typesListing.add(TypesOfLoan(R.drawable.car_loan_image, "Car Loan"))
        typesListing.add(TypesOfLoan(R.drawable.education_loan, "Education Loan"))
        typesListing.add(TypesOfLoan(R.drawable.personal_loan, "Personal Loan"))
        typesListing.add(TypesOfLoan(R.drawable.business_loan, "Business Loan"))
        typesListing.add(TypesOfLoan(R.drawable.gold_loan, "Gold Loan"))
        val loanTypeRV = CommonTypeMoneyAdapter(typesListing)
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