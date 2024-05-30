package com.borrow.money.cash.loan.loanguide.activityMoney

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.R
import com.borrow.money.cash.loan.loanguide.databinding.MoneyTipsBinding

class    TipsMoney_10 : AppCompatActivity() {
    private lateinit var mBinding: MoneyTipsBinding
    var strTag: String? = null
    var w = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyTipsBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "Loan Tips"

        strTag = intent.getStringExtra("tag")
        if (strTag == "balance_online_2") {
            mBinding.btnSend.setImageResource(R.drawable.detail_call)
            mBinding.btnCopy.setImageResource(R.drawable.detail_copy)
            mBinding.imgTitleLogo.setImageResource(R.drawable.pf_balance)
            mBinding.viewBalanceOnline2.visibility = View.GONE
            mBinding.viewBalanceOnline.visibility = View.VISIBLE
            mBinding.textBody.text = "Check Your PF Balance Without Internet Through"
            w = 2
        } else if (strTag == "balance_online") {
            mBinding.btnSend.setImageResource(R.drawable.send)
            mBinding.btnCopy.setImageResource(R.drawable.detail_copy)
            mBinding.imgTitleLogo.setImageResource(R.drawable.detail2_message)
            mBinding.viewBalanceOnline2.visibility = View.VISIBLE
            mBinding.viewBalanceOnline.visibility = View.GONE
            mBinding.textBody.text = "Check Your PF Balance Without Internet Through"
            w = 1
        } else if (strTag == "helpline") {
            mBinding.btnSend.setImageResource(R.drawable.detail_call)
            mBinding.btnCopy.setImageResource(R.drawable.detail_copy)
            mBinding.imgTitleLogo.setImageResource(R.drawable.detail2_helpline)
            mBinding.viewBalanceOnline2.visibility = View.GONE
            mBinding.viewBalanceOnline.visibility = View.VISIBLE
            mBinding.textBody.text =
                "Helpline Nubmer Solve Your Query Related EPF by just Giving a Call on Toll Free Number"
            w = 3
        }
        mBinding.btnSend.setOnClickListener(View.OnClickListener {
            val intent: Intent
            if (w == 1) {
                intent = Intent("android.intent.action.VIEW")
                intent.data = Uri.parse("smsto:7738299899")
                intent.type = "vnd.android-dir/mms-sms"
                intent.putExtra("address", "7738299899")
                intent.putExtra("sms_body", "EPFOHO UAN ENG to 7738299899 ")
            } else {
                intent = if (w == 2) {
                    Intent("android.intent.action.DIAL")
                } else if (w != 3) {
                    return@OnClickListener
                } else {
                    Intent("android.intent.action.DIAL")
                }
                intent.data = Uri.parse("tel:1800118005")
            }
            startActivity(intent)
        })
        mBinding.btnCopy.setOnClickListener {
            it.isEnabled = false
                        it.isEnabled = true
                        (getSystemService(CLIPBOARD_SERVICE) as ClipboardManager).setPrimaryClip(
                            ClipData.newPlainText("copy_link", mBinding.phoneNo.text.toString())
                        )
                        Toast.makeText(this@TipsMoney_10, "Number Copy", Toast.LENGTH_SHORT)
                            .show()

         

        }
        mBinding.conToolbar.btnBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
                    finish()
    }
}