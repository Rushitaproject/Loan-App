package com.borrow.money.cash.loan.loanguide.activityMoney.aadharMoney

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.borrow.money.cash.loan.loanguide.adapterMoney.loantypeMoney.AadharMoneyAdapter

import com.borrow.money.cash.loan.loanguide.databinding.MoneyAdviseOfAadharLoanBinding
import com.borrow.money.cash.loan.loanguide.model.LoanKind

class AadharLoanMoney_18 : AppCompatActivity() {
    private lateinit var mBinding: MoneyAdviseOfAadharLoanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyAdviseOfAadharLoanBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        settingUpRecycler()
        handleClickEvent()
    }

    private fun settingUpRecycler() {
        val kindListing = ArrayList<LoanKind>()
        kindListing.add(LoanKind("What is Aadhaar?"))
        kindListing.add(LoanKind("Update your Aadhaar details"))
        kindListing.add(LoanKind("check the status"))
        kindListing.add(LoanKind("update the address in your 'Aadhaar'"))
        kindListing.add(LoanKind("request for address validation letter."))
        kindListing.add(LoanKind("What is e-Aadhaar about UIDAI?"))
        kindListing.add(LoanKind("What is a masked base?"))
        kindListing.add(LoanKind("What is a masked base?"))
        kindListing.add(LoanKind("Is the physical copy of Aadhaar e-Aadhaar equally valid?"))
        kindListing.add(LoanKind("Does linking my bank account, PAN and other services with Aadhaar make me unsafe?"))
        kindListing.add(LoanKind("Where multiple address proofs are available to a resident (eg current andoriginal), what proof will UIDAI accept,and where will that Aadhaar letter be sent?"))
        val loanTypeRV = AadharMoneyAdapter(kindListing)
        val gridLayoutManager = GridLayoutManager(this, 1)
        mBinding.recyclerLoanType.setHasFixedSize(true)
        mBinding.recyclerLoanType.layoutManager = gridLayoutManager
        mBinding.recyclerLoanType.adapter = loanTypeRV
    }

    private fun handleClickEvent() {
        mBinding.conToolbar.heading.text = "Aadhar Loan advise"
        mBinding.conToolbar.btnBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
                    finish()
    }
}