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
import com.borrow.money.cash.loan.loanguide.activityMoney.HomeMoney_4
import com.borrow.money.cash.loan.loanguide.activityMoney.StartMoney_1
import com.borrow.money.cash.loan.loanguide.adapterMoney.selectedMoneyAdapter
import com.borrow.money.cash.loan.loanguide.adhelperMoney.SharedPrefs
import com.borrow.money.cash.loan.loanguide.databinding.MoneyIntroTwoBinding
import com.borrow.money.cash.loan.loanguide.model.CurrencyItem
import com.borrow.money.cash.loan.loanguide.utility.PrefManaging
import com.google.android.material.button.MaterialButton

class IntroTwoMoney_3 : AppCompatActivity() {
    private lateinit var mBinding: MoneyIntroTwoBinding
    private val currencyItems = ArrayList<CurrencyItem>()
    private var adapter: selectedMoneyAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyIntroTwoBinding.inflate(layoutInflater)
        val view = mBinding.root
        setContentView(view)

        settingUpRecycler()
        makingList()
        handleClickEvent()
    }

    private fun handleClickEvent() {
        mBinding.btnNext.setOnClickListener {
            it.isEnabled = true
            PrefManaging.editor("isCurrency", true)
            SharedPrefs.savePref(this@IntroTwoMoney_3, "isCurrency", true)
            startActivity(Intent(this@IntroTwoMoney_3, HomeMoney_4::class.java))
            finish()

        }
    }

    private fun makingList() {
        val currencyItems = arrayOf(
            CurrencyItem("United States", R.drawable.flag_usd, "$"),
            CurrencyItem("European Union", R.drawable.flag_eur, "€"),
            CurrencyItem("United Kingdom", R.drawable.flag_gbp, "£"),
            CurrencyItem("Japan", R.drawable.flag_jpy, "¥"),
            CurrencyItem("Switzerland", R.drawable.flag_chf, "CHF"),
            CurrencyItem("Australia", R.drawable.flag_aud, "AU$"),
            CurrencyItem("Canada", R.drawable.flag_cad, "CA$"),
            CurrencyItem("China", R.drawable.flag_cny, "¥"),
            CurrencyItem("India", R.drawable.flag_inr, "₹"),
            CurrencyItem("Russia", R.drawable.flag_rub, "₽"),
            CurrencyItem("South Korea", R.drawable.flag_slovakia, "₩"),
            CurrencyItem("Brazil", R.drawable.flag_brl, "R$"),
            CurrencyItem("Mexico", R.drawable.flag_mxn, "Mex$"),
            CurrencyItem("South Africa", R.drawable.flag_zar, "R"),
            CurrencyItem("Saudi Arabia", R.drawable.flag_sar, "﷼"),
            CurrencyItem("United Arab Emirates", R.drawable.flag_united_arab_emirates, "د.إ"),
            CurrencyItem("Israel", R.drawable.flag_ils, "₪"),
            CurrencyItem("Turkey", R.drawable.flag_try, "₺"),
            CurrencyItem("Sweden", R.drawable.flag_sek, "kr"),
            CurrencyItem("Norway", R.drawable.flag_nok, "kr"),
            CurrencyItem("New Zealand", R.drawable.flag_nzd, "NZ$"),
            CurrencyItem("Singapore", R.drawable.flag_sgd, "S$"),
            CurrencyItem("Hong Kong", R.drawable.flag_hkd, "HK$"),
            CurrencyItem("Malaysia", R.drawable.flag_myr, "RM"),
            CurrencyItem("Indonesia", R.drawable.flag_idr, "Rp"),
            CurrencyItem("Egypt", R.drawable.flag_egp, "E£"),
            CurrencyItem("Nigeria", R.drawable.flag_ngn, "₦"),
            CurrencyItem("Kenya", R.drawable.flag_kes, "KSh"),
            CurrencyItem("Argentina", R.drawable.flag_ars, "$"),
            CurrencyItem("Chile", R.drawable.flag_clp, "CL$"),
            CurrencyItem("Colombia", R.drawable.flag_cop, "COL$"),
            CurrencyItem("Peru", R.drawable.flag_pen, "S/"),
            CurrencyItem("Venezuela", R.drawable.flag_vef, "Bs"),
            CurrencyItem("Ghana", R.drawable.flag_ghs, "GH₵"),
            CurrencyItem("Afghanistan", R.drawable.flag_afn, "؋"),
            CurrencyItem("Georgia", R.drawable.flag_gel, "ლ"),
            CurrencyItem("Bahrain", R.drawable.flag_bhd, ".د.ب"),
            CurrencyItem("Bangladesh", R.drawable.flag_bdt, "৳"),
            CurrencyItem("Bhutan", R.drawable.flag_btn, "Nu."),
            CurrencyItem("Brunei", R.drawable.flag_bnd, "\$"),

            CurrencyItem("Poland", R.drawable.flag_pln, "zł"),
            CurrencyItem("Philippines", R.drawable.flag_php, "₱"),
            CurrencyItem("Qatar", R.drawable.flag_qar, "﷼"),
            CurrencyItem("Spain", R.drawable.flag_spain, "€"),
            CurrencyItem("Italy", R.drawable.flag_italy, "€"),
            CurrencyItem("France", R.drawable.flag_france, "€"),
            CurrencyItem("Thailand", R.drawable.flag_thb, "฿"),
            CurrencyItem("Oman", R.drawable.flag_omr, "﷼"),
            CurrencyItem("South Africa", R.drawable.flag_zar, "R"),
            CurrencyItem("Saudi Arabia", R.drawable.flag_sar, "﷼")
        )

        val currencyArrayList = ArrayList<CurrencyItem>()
        for (i in currencyItems.indices) {
            currencyArrayList.add(currencyItems[i])
        }
        adapter!!.setEmployees(currencyArrayList)
    }

    private fun settingUpRecycler() {
        mBinding.heading.text = "Currency Selection"
        mBinding.rvCurrency.layoutManager = LinearLayoutManager(this)
        adapter = selectedMoneyAdapter(this, currencyItems)
        mBinding.rvCurrency.adapter = adapter
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