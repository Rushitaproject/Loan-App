package com.borrow.money.cash.loan.loanguide.activityMoney.bikeMoney

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.borrow.money.cash.loan.loanguide.adapterMoney.loantypeMoney.BikeMoneyAdapter

import com.borrow.money.cash.loan.loanguide.databinding.MoneyBikeLoannfoBinding
import com.borrow.money.cash.loan.loanguide.model.LoanKind

class BikeLoanfoMoney_24 : AppCompatActivity() {
    private lateinit var mBinding: MoneyBikeLoannfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyBikeLoannfoBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "Bike Loan advise"
        val arrayList = ArrayList<LoanKind>()
        arrayList.add(LoanKind("What is Bike loan?"))
        arrayList.add(LoanKind("Eligibility Criteria for a Bike Loan ?"))
        val loanTypeRV = BikeMoneyAdapter(arrayList)
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