package com.borrow.money.cash.loan.loanguide.introMoney


import android.app.Dialog
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.ViewGroup
import android.view.Window
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.LinearLayoutManager
import com.borrow.money.cash.loan.loanguide.R
import com.borrow.money.cash.loan.loanguide.activityMoney.StartMoney_1
import com.borrow.money.cash.loan.loanguide.adapterMoney.SingleSelectionMoneyAdapter
import com.borrow.money.cash.loan.loanguide.adhelperMoney.SharedPrefs
import com.borrow.money.cash.loan.loanguide.databinding.MoneyIntroOneBinding
import com.borrow.money.cash.loan.loanguide.model.CountryItem
import com.google.android.material.button.MaterialButton


class IntroOneMoney_2 : AppCompatActivity() {
    private lateinit var mBinding: MoneyIntroOneBinding
    private val countryItems = ArrayList<CountryItem>()
    private var adapter: SingleSelectionMoneyAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyIntroOneBinding.inflate(layoutInflater)
        val view = mBinding.root
        setContentView(view)

        settingUpRecycler()
        makingList()
        handleClickEvent()
    }


    private fun handleClickEvent() {
        mBinding.btnNext.setOnClickListener {
                        it.isEnabled = true
                        SharedPrefs.savePref(this@IntroOneMoney_2, "isCountry", true)
                        startActivity(
                            Intent(
                                this@IntroOneMoney_2,
                                IntroTwoMoney_3::class.java
                            )
                        )
                        finish()
        }
    }

    private fun settingUpRecycler() {
        mBinding.heading.text = "Country Selection"
        mBinding.rvCountry.layoutManager = LinearLayoutManager(this)
        adapter = SingleSelectionMoneyAdapter(this, countryItems)
        mBinding.rvCountry.adapter = adapter
    }

    private fun makingList() {
        val countryItems = arrayOf(
            CountryItem("United States", R.drawable.flag_usd),
            CountryItem("European Union", R.drawable.flag_eur),
            CountryItem("United Kingdom", R.drawable.flag_gbp),
            CountryItem("Japan", R.drawable.flag_jpy),
            CountryItem("Switzerland", R.drawable.flag_chf),
            CountryItem("Australia", R.drawable.flag_aud),
            CountryItem("Canada", R.drawable.flag_cad),
            CountryItem("China", R.drawable.flag_cny),
            CountryItem("India", R.drawable.flag_inr),
            CountryItem("Russia", R.drawable.flag_rub),
            CountryItem("South Korea", R.drawable.flag_slovakia),
            CountryItem("Brazil", R.drawable.flag_brl),
            CountryItem("Mexico", R.drawable.flag_mxn),
            CountryItem("South Africa", R.drawable.flag_zar),
            CountryItem("Saudi Arabia", R.drawable.flag_sar),
            CountryItem("United Arab Emirates", R.drawable.flag_united_arab_emirates),
            CountryItem("Israel", R.drawable.flag_ils),
            CountryItem("Turkey", R.drawable.flag_try),
            CountryItem("Sweden", R.drawable.flag_sek),
            CountryItem("Norway", R.drawable.flag_nok),
            CountryItem("New Zealand", R.drawable.flag_nzd),
            CountryItem("Singapore", R.drawable.flag_sgd),
            CountryItem("Hong Kong", R.drawable.flag_hkd),
            CountryItem("Malaysia", R.drawable.flag_myr),
            CountryItem("Indonesia", R.drawable.flag_idr),
            CountryItem("Egypt", R.drawable.flag_egp),
            CountryItem("Nigeria", R.drawable.flag_ngn),
            CountryItem("Kenya", R.drawable.flag_kes),
            CountryItem("Argentina", R.drawable.flag_ars),
            CountryItem("Chile", R.drawable.flag_clp),
            CountryItem("Colombia", R.drawable.flag_cop),
            CountryItem("Peru", R.drawable.flag_pen),
            CountryItem("Venezuela", R.drawable.flag_vef),
            CountryItem("Ghana", R.drawable.flag_ghs),
            CountryItem("Afghanistan", R.drawable.flag_afn),
            CountryItem("Georgia", R.drawable.flag_gel),
            CountryItem("Bahrain", R.drawable.flag_bhd),
            CountryItem("Bangladesh", R.drawable.flag_bdt),
            CountryItem("Bhutan", R.drawable.flag_btn),
            CountryItem("Brunei", R.drawable.flag_bnd),

            CountryItem("Poland", R.drawable.flag_pln),
            CountryItem("Philippines", R.drawable.flag_php),
            CountryItem("Qatar", R.drawable.flag_qar),
            CountryItem("Spain", R.drawable.flag_spain),
            CountryItem("Italy", R.drawable.flag_italy),
            CountryItem("France", R.drawable.flag_france),
            CountryItem("Thailand", R.drawable.flag_thb),
            CountryItem("Oman", R.drawable.flag_omr),
            CountryItem("South Africa", R.drawable.flag_zar),
            CountryItem("Saudi Arabia", R.drawable.flag_sar)
        )

        val countryArrayList = ArrayList<CountryItem>()
        for (i in countryItems.indices) {
            countryArrayList.add(countryItems[i])
        }
        adapter!!.setEmployees(countryArrayList)
    }

    override fun onBackPressed() {
            startExit()
    }

    private fun startExit() {
        val dialog = Dialog(this)
        dialog.setCancelable(false)
        dialog.requestWindowFeature(1)
        dialog.window!!.requestFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.dialog_exit)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(0))
        dialog.setCanceledOnTouchOutside(false)
        val tvOk = dialog.findViewById<MaterialButton>(R.id.btn_yes)
        val tvCancel = dialog.findViewById<MaterialButton>(R.id.btn_no)
        tvOk.setOnClickListener {
            finishAffinity()
            dialog.dismiss()
        }
        tvCancel.setOnClickListener { dialog.dismiss() }
        val window = dialog.window
        window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        dialog.show()
    }


}