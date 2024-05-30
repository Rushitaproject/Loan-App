package com.borrow.money.cash.loan.loanguide.activityMoney.bankMoney

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.borrow.money.cash.loan.loanguide.adapterMoney.bankMoney.BankTypeMoneyAdapter
import com.borrow.money.cash.loan.loanguide.databinding.MoneyBankDataBinding
import com.borrow.money.cash.loan.loanguide.model.BankType

class BankDataMoney_30 : AppCompatActivity() {
    private lateinit var mBinding: MoneyBankDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyBankDataBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)
        settingUpRecycler()
        handleClickEvent()
    }

    private fun handleClickEvent() {
        mBinding.conToolbar.heading.text = "Choose your bank name"
        mBinding.conToolbar.btnBack.setOnClickListener {

            onBackPressed()
        }
    }

    private fun settingUpRecycler() {
        val bankListing = ArrayList<BankType>()
        bankListing.add(BankType("Axis Bank", "18004195959", "18004196969", "18604195555"))
        bankListing.add(BankType("ICICI Bank", "9594612612", "9594613613", "18002003344"))
        bankListing.add(BankType("IDBI Bank", "18008431122", "18008431133", "18002094324"))
        bankListing.add(BankType("IDFC Bank", "18002700720", "5676732", "18004194332"))
        bankListing.add(BankType("Dena Bank", "09289356677", "09278656677", "18002336427"))
        bankListing.add(
            BankType(
                "State Bank of India",
                "09223766666",
                "09223866666",
                "18004253800"
            )
        )
        bankListing.add(BankType("Bank of Baroda", "08468001111", "08468001122", "18001024455"))
        bankListing.add(BankType("HDFC Bank", "18002703333", "18002703355", "18602676161"))
        bankListing.add(BankType("Bank Of India", "09015135135", "9810558585", "1800220229"))
        bankListing.add(
            BankType(
                "Union Bank of India",
                "09223008586",
                "09223008486",
                "18002082244"
            )
        )
        bankListing.add(BankType("UCO Bank", "09278792787", "09213125125", "18002740123"))
        bankListing.add(
            BankType(
                "Kotak Mahindra Bank",
                "18002740110",
                "9971056767",
                "18602662666"
            )
        )
        bankListing.add(BankType("Punjab National Bank", "18001802223", "5607040", "18001802222"))
        bankListing.add(BankType("Yes Bank", "09223920000", "09223921111", "18001200"))
        bankListing.add(BankType("Canara Bank", "09015483483", "09015734744", "18004250018"))
        bankListing.add(BankType("Corporation Bank", "09289792897", "5667716", "18004253555"))
        bankListing.add(BankType("Vijaya Bank", "18001035525", "18001035535", "18004255885"))
        bankListing.add(
            BankType(
                "Varachha Cooperative Bank Limited",
                "02614008080",
                "NA",
                "18002587750"
            )
        )
        bankListing.add(BankType("Allahabad Bank", "09224150150", "09224150150", "18005722000"))
        bankListing.add(BankType("HSBC Bank", "18001034722", "9611124722", "18001034722"))
        bankListing.add(BankType("South Indian Bank", "09223008488", "9840777222", "18004251809"))
        bankListing.add(BankType("Dhanlaxmi Bank", "08067747700", "08067747733", "04876613000"))
        bankListing.add(
            BankType(
                "Central Bank of India",
                "09555244442",
                "09555244441",
                "1800221911"
            )
        )
        bankListing.add(BankType("Andhra Bank", "09223011300", "9223173924", "18004251515"))
        bankListing.add(BankType("Indian Bank", "09289592895", "944439443", "180042500000"))
        bankListing.add(
            BankType(
                "Indian Overseas Bank",
                "04442220004",
                "8424022122",
                "18004254445"
            )
        )
        bankListing.add(
            BankType(
                "United Bank Of India",
                "092230085486",
                "09223008486",
                "18002082244"
            )
        )
        bankListing.add(BankType("ANZ Bank", "18002000269", "NA", "18002000269"))
        bankListing.add(BankType("Deutsche Bank", "18001236601", "561615", "18602666601"))
        bankListing.add(BankType("Federal Bank", "08431900900", "08431600600", "18004201199"))
        bankListing.add(BankType("Punjab & Sind Bank", "07039035156", "9773056161", "18004198300"))
        bankListing.add(BankType("ABN Amro Bank", "1800112224", "NA", "1800112224"))
        bankListing.add(BankType("Karnataka Bank", "18004251445", "18004251446", "18004251444"))
        bankListing.add(BankType("DCB Bank", "07506660011", "07506660022", "18002095363"))
        bankListing.add(BankType("Barclays Bank", "02260007888", "NA", "02260007888"))
        bankListing.add(
            BankType(
                "Bharatiya Mahila Bank",
                "9212438888",
                "9212438888",
                "1147472100"
            )
        )
        bankListing.add(BankType("Royal Bank of Scotland", "09227148472", "NA", "1800112224"))
        bankListing.add(BankType("Tamilnad Mercantile Bank", "09211927373", "NA", "9842461461"))
        bankListing.add(BankType("Syndicate Bank", "09210332255", "9210332255", "180030113333"))
        bankListing.add(BankType("RBL Bank", "18004190610", "9223366333", "18001238040"))
        bankListing.add(
            BankType(
                "State Bank of Mysore",
                "09223766666",
                "09223866666",
                "18004252244"
            )
        )
        bankListing.add(
            BankType(
                "Bank of Maharashtra",
                "18002334526",
                "9223181818",
                "18002334526"
            )
        )
        bankListing.add(BankType("Induslnd Bank", "18002741000", "9212299955", "18605005004"))
        bankListing.add(BankType("Bandhan Bank", "09223008666", "09223008777", "1800588181"))
        bankListing.add(
            BankType(
                "Oriental Bank of Commerce",
                "08067205757",
                "08067205767",
                "18001801235"
            )
        )
        bankListing.add(
            BankType(
                "State Bank of Hyderabad",
                "09223766666",
                "09223866666",
                "18004251825"
            )
        )
        bankListing.add(BankType("Lakshmi Vilas Bank", "8882441155", "9282441155", "18004252233"))
        bankListing.add(
            BankType(
                "State Bank of Patiyala",
                "09223766666",
                "09223866666",
                "18001802010"
            )
        )
        bankListing.add(
            BankType(
                "State Bank of Bikaner & jaipur",
                "09223766666",
                "092238666666",
                "18001806005"
            )
        )
        bankListing.add(
            BankType(
                "State Bank of Travancore",
                "09223766666",
                "092238666666",
                "18004253800"
            )
        )
        bankListing.add(BankType("Citi Bank", "18602102484", "NA", "18602102484"))
        val loanTypeRV = BankTypeMoneyAdapter(bankListing)
        val gridLayoutManager = GridLayoutManager(this, 1)
        mBinding.recyclerLoanType.setHasFixedSize(true)
        mBinding.recyclerLoanType.layoutManager = gridLayoutManager
        mBinding.recyclerLoanType.adapter = loanTypeRV
    }

    override fun onBackPressed() {
                    finish()
    }
}