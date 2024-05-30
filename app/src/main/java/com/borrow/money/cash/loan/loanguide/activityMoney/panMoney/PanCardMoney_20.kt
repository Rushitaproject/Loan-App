package com.borrow.money.cash.loan.loanguide.activityMoney.panMoney

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.borrow.money.cash.loan.loanguide.adapterMoney.loantypeMoney.PanMoneyAdapter
import com.borrow.money.cash.loan.loanguide.databinding.MoneyAdviseOfPanCardBinding
import com.borrow.money.cash.loan.loanguide.model.LoanKind

class PanCardMoney_20 : AppCompatActivity() {
    private lateinit var mBinding: MoneyAdviseOfPanCardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyAdviseOfPanCardBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "Pan Card advise"

        val kindListing = ArrayList<LoanKind>()
        kindListing.add(LoanKind("What is PAN?"))
        kindListing.add(LoanKind("Who can apply for PAN?"))
        kindListing.add(LoanKind("Who can apply on behalf of minor, insane,foolish, retarded, dead and wards of the court?"))
        kindListing.add(LoanKind("Do | need to apply for a new PAN when | move from one city to another?"))
        kindListing.add(LoanKind("Can | get more than one PAN?"))
        kindListing.add(LoanKind("What should | do if | have more than one pan?"))
        kindListing.add(LoanKind("Is any third party used for verification of identity and address with the genuineness of the documents submitted by the applicants?"))
        kindListing.add(LoanKind("Is email ID mandatory to get e-PAN?"))
        kindListing.add(LoanKind("What is the annual information return (AIR)?"))
        kindListing.add(LoanKind("Is any third party used for verification of identity and address with the genuineness of the documents submitted by the applicants?"))
        kindListing.add(LoanKind("Should an organization that files AIR, file a\nsingle AIR for the entire organization or can\n\nfile separate AIR for each of its branches /\nregional offices?"))
        kindListing.add(LoanKind("Who is authorized to get AIR?"))
        kindListing.add(LoanKind("ePAN Card - Eligibility and Application\nProcedure."))
        kindListing.add(LoanKind("Eligibility For ePan Quarterly."))
        kindListing.add(LoanKind("What is e-TDS / TCS Statement?"))
        kindListing.add(LoanKind("Who should file e-TDS / TCS details?"))
        kindListing.add(LoanKind("E-TDS / TCS details have been made\nmandatory for government deductors.\n\nHow can | know if | am a government\ndeductor or not?"))
        kindListing.add(LoanKind("E-TDS / TCS details have been made\nmandatory for government deductors.\n\nHow can | know if | am a government\ndeductor or not?"))
        kindListing.add(LoanKind("Who is the e-filing administrator?"))
        kindListing.add(LoanKind("Who is E-TDS / TCS Intermediate?"))
        kindListing.add(LoanKind("Can we get details about Form 15CA?\n\nOr can we re-print our Form 15CA?"))
        val loanTypeRV = PanMoneyAdapter(kindListing)
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