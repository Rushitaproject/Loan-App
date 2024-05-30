package com.borrow.money.cash.loan.loanguide.activityMoney

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.borrow.money.cash.loan.loanguide.R
import com.borrow.money.cash.loan.loanguide.adapterMoney.loantypeMoney.DiscountMoneyAdapter
import com.borrow.money.cash.loan.loanguide.databinding.MoneyDiscountTypeBinding
import com.borrow.money.cash.loan.loanguide.model.TypesOfLoan

class DiscountTypeMoney_17 : AppCompatActivity() {
    private lateinit var mBinding: MoneyDiscountTypeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyDiscountTypeBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "Discounted LoanType"

        val discountedListing = ArrayList<TypesOfLoan>()
        discountedListing.add(TypesOfLoan(R.drawable.home_loan, "Home Loan"))
        discountedListing.add(TypesOfLoan(R.drawable.personal_loan, "Home Loan"))
        discountedListing.add(TypesOfLoan(R.drawable.business_loan, "Business Loan"))
        discountedListing.add(TypesOfLoan(R.drawable.education_loan, "Education Loan"))
        discountedListing.add(TypesOfLoan(R.drawable.car_loan_image, "Car Loan"))
        discountedListing.add(TypesOfLoan(R.drawable.gold_loan, "Gold Loan"))
        discountedListing.add(TypesOfLoan(R.drawable.ic_aadhar_card, "Aadhar Loan"))
        discountedListing.add(TypesOfLoan(R.drawable.ic_pan_card, "PAN Card Download"))
        discountedListing.add(
            TypesOfLoan(
                R.drawable.ic_credit_card_loan,
                "Credit Card Loan advise"
            )
        )
        discountedListing.add(TypesOfLoan(R.drawable.ic_bike_loan, "Bike Loan advise"))
        val loanTypeRV = DiscountMoneyAdapter(discountedListing)
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