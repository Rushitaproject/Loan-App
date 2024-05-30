package com.borrow.money.cash.loan.loanguide.activityMoney

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.borrow.money.cash.loan.loanguide.adapterMoney.ServiceMoneyAdapter
import com.borrow.money.cash.loan.loanguide.databinding.MoneyServiceBinding
import com.borrow.money.cash.loan.loanguide.model.LoanKind

class ServiceMoney_27 : AppCompatActivity() {
    private lateinit var mBinding: MoneyServiceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyServiceBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "Service Exercise"

        val kindListing = ArrayList<LoanKind>()
        kindListing.add(LoanKind("Establishment Registrationn"))
        kindListing.add(LoanKind("KYC Updation"))
        kindListing.add(LoanKind("Umang"))
        kindListing.add(LoanKind("ECR/Returns and Payment"))
        kindListing.add(LoanKind("Online Claims account transfer"))
        kindListing.add(LoanKind("E-Passbook"))
        kindListing.add(LoanKind("Sharam suvidha commen ECR"))
        kindListing.add(LoanKind("Personal Portal"))
        kindListing.add(LoanKind("International Workers Portal"))
        kindListing.add(LoanKind("EKYC Portal"))
        val loanTypeRV = ServiceMoneyAdapter(kindListing)
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