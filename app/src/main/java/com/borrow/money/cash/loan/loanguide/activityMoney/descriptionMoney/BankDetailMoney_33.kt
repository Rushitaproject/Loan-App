package com.borrow.money.cash.loan.loanguide.activityMoney.descriptionMoney

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.databinding.MoneyBankDetailBinding

class BankDetailMoney_33 : AppCompatActivity() {
    private lateinit var mBinding: MoneyBankDetailBinding
    var number: String? = null
    var care: String? = null
    var name: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyBankDetailBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)


        mBinding.conToolbar.heading.text = "Bank info"
        number = intent.getStringExtra("number")
        name = intent.getStringExtra("name")
        care = intent.getStringExtra("care")
        mBinding.balanceNo.text = number
        mBinding.careNo.text = care
        mBinding.balanceNo.setOnClickListener {

                        it.isEnabled = true
                        (getSystemService(CLIPBOARD_SERVICE) as ClipboardManager).setPrimaryClip(
                            ClipData.newPlainText("copy_link", mBinding.balanceNo.text.toString())
                        )
                        Toast.makeText(this@BankDetailMoney_33, "Link Copy", Toast.LENGTH_SHORT)
                            .show()

        }
        mBinding.careNo.setOnClickListener {
                        it.isEnabled = true
                        (getSystemService(CLIPBOARD_SERVICE) as ClipboardManager).setPrimaryClip(
                            ClipData.newPlainText("copy_link", mBinding.careNo.text.toString())
                        )
                        Toast.makeText(this@BankDetailMoney_33, "Link Copy", Toast.LENGTH_SHORT)
                            .show()

        }
        mBinding.btnBalanceShare.setOnClickListener {
                        it.isEnabled = true
                        val intent = Intent("android.intent.action.SEND")
                        intent.putExtra(
                            "android.intent.extra.TEXT",
                            "$name Bank Balance Cheking Number is :$number"
                        )
                        intent.type = "text/plain"
                        startActivity(Intent.createChooser(intent, "Share"))

        }
        mBinding.btnCareShare.setOnClickListener {
                        it.isEnabled = true
                        val intent = Intent("android.intent.action.SEND")
                        intent.putExtra("android.intent.extra.TEXT", "$name  Customer Care Number is :$care")
                        intent.type = "text/plain"
                        startActivity(Intent.createChooser(intent, "Share"))

        }
        mBinding.conToolbar.btnBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
                    finish()
    }
}