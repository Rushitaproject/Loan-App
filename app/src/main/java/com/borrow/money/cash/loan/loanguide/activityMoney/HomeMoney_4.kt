package com.borrow.money.cash.loan.loanguide.activityMoney

import android.app.Dialog
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.appcompat.app.AppCompatActivity

import com.borrow.money.cash.loan.loanguide.R
import com.borrow.money.cash.loan.loanguide.activityMoney.bankMoney.BankDataMoney_30
import com.borrow.money.cash.loan.loanguide.activityMoney.bankMoney.SelectionBankMoney_32
import com.borrow.money.cash.loan.loanguide.activityMoney.calculatorMoney.EmiCalMoney_34
import com.borrow.money.cash.loan.loanguide.activityMoney.loantypeMoney.LoanTypeMoney_5
import com.borrow.money.cash.loan.loanguide.activityMoney.loantypeMoney.LoanTypeMoreMoney_15
import com.borrow.money.cash.loan.loanguide.activityMoney.mapMoney.MapMoney_36
import com.borrow.money.cash.loan.loanguide.activityMoney.mapMoney.NearMeMoney_29
import com.borrow.money.cash.loan.loanguide.databinding.MoneyHomeBinding
import com.google.android.material.button.MaterialButton

class HomeMoney_4 : AppCompatActivity() {
    private lateinit var binding: MoneyHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MoneyHomeBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        handleClickEvent()

    }


    private fun handleClickEvent() {
        binding.btnLoanGuide.setOnClickListener {
            it.isEnabled = false
            it.isEnabled = true
            startActivity(
                Intent(
                    this@HomeMoney_4,
                    LoanTypeMoney_5::class.java
                )
            )
        }
        binding.btnEPFService.setOnClickListener {
            it.isEnabled = false
            it.isEnabled = true
            startActivity(
                Intent(
                    this@HomeMoney_4,
                    EpfServiceMoney_7::class.java
                )
            )
        }
        binding.btnEpfOnline.setOnClickListener {
            it.isEnabled = false
            it.isEnabled = true
            startActivity(
                Intent(
                    this@HomeMoney_4,
                    EpfOnlineMoney_11::class.java
                )
            )
        }
        binding.howToGetLoan.setOnClickListener {
            it.isEnabled = false
            it.isEnabled = true
            startActivity(
                Intent(
                    this@HomeMoney_4,
                    LoanInformMoney_13::class.java
                )
            )
        }
        binding.guide.setOnClickListener {
            it.isEnabled = false
            it.isEnabled = true
            startActivity(
                Intent(
                    this@HomeMoney_4,
                    LoanTypeMoreMoney_15::class.java
                )
            )
        }
        binding.type.setOnClickListener {
            it.isEnabled = false
            it.isEnabled = true
            startActivity(
                Intent(
                    this@HomeMoney_4,
                    DiscountTypeMoney_17::class.java
                )
            )
        }
        binding.service.setOnClickListener {
            it.isEnabled = false
            it.isEnabled = true
            startActivity(Intent(this@HomeMoney_4, ServiceMoney_27::class.java))
        }
        binding.nearby.setOnClickListener {
            it.isEnabled = false
            it.isEnabled = true
            startActivity(
                Intent(
                    this@HomeMoney_4,
                    NearMeMoney_29::class.java
                )
            )
        }
        binding.info.setOnClickListener {
            it.isEnabled = false
            it.isEnabled = true
            startActivity(
                Intent(
                    this@HomeMoney_4,
                    BankDataMoney_30::class.java
                )
            )
        }
        binding.btnAllBankBalance.setOnClickListener {
            it.isEnabled = false
            it.isEnabled = true
            startActivity(
                Intent(
                    this@HomeMoney_4,
                    SelectionBankMoney_32::class.java
                )
            )
        }
        binding.btnEmiCalculator.setOnClickListener {
            it.isEnabled = false
            it.isEnabled = true
            startActivity(Intent(this@HomeMoney_4, EmiCalMoney_34::class.java))
        }
        binding.btnNearByMe.setOnClickListener {
            it.isEnabled = false
            it.isEnabled = true
            startActivity(Intent(this@HomeMoney_4, MapMoney_36::class.java))
        }

    }

    override fun onResume() {
        super.onResume()
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