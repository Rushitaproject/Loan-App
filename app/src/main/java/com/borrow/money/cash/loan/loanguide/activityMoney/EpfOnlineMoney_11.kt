package com.borrow.money.cash.loan.loanguide.activityMoney

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.activityMoney.descriptionMoney.EpfOnlineDetailMoney_12
import com.borrow.money.cash.loan.loanguide.databinding.MoneyEpfOnlineBinding

class EpfOnlineMoney_11 : AppCompatActivity() {
    private lateinit var mBinding: MoneyEpfOnlineBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyEpfOnlineBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "Epf Online"
        mBinding.btnCheckEpf.setOnClickListener {
            it.isEnabled = true
            startActivity(
                Intent(this@EpfOnlineMoney_11, EpfOnlineDetailMoney_12::class.java)
                    .putExtra("NineTag", "0")
            )
        }
        mBinding.btnClaim.setOnClickListener {
            it.isEnabled = true
            startActivity(
                Intent(this@EpfOnlineMoney_11, EpfOnlineDetailMoney_12::class.java)
                    .putExtra("NineTag", "1")
            )
        }
        mBinding.btnOnline.setOnClickListener {
            it.isEnabled = true
            startActivity(
                Intent(this@EpfOnlineMoney_11, EpfOnlineDetailMoney_12::class.java)
                    .putExtra("NineTag", "2")
            )
        }
        mBinding.btnMember.setOnClickListener {
            it.isEnabled = true
            startActivity(
                Intent(this@EpfOnlineMoney_11, EpfOnlineDetailMoney_12::class.java)
                    .putExtra("NineTag", "3")
            )
        }
        mBinding.btnDonwnload.setOnClickListener {
            it.isEnabled = true
            startActivity(
                Intent(this@EpfOnlineMoney_11, EpfOnlineDetailMoney_12::class.java)
                    .putExtra("NineTag", "4")
            )
        }
        mBinding.btnMultiPf.setOnClickListener {
            it.isEnabled = true
            startActivity(
                Intent(this@EpfOnlineMoney_11, EpfOnlineDetailMoney_12::class.java)
                    .putExtra("NineTag", "5")
            )
        }
        mBinding.btnEPassbook.setOnClickListener {
            it.isEnabled = true
            startActivity(
                Intent(this@EpfOnlineMoney_11, EpfOnlineDetailMoney_12::class.java)
                    .putExtra("NineTag", "6")
            )
        }
        mBinding.btnDonwloads.setOnClickListener {
            it.isEnabled = true
            startActivity(
                Intent(this@EpfOnlineMoney_11, EpfOnlineDetailMoney_12::class.java)
                    .putExtra("NineTag", "7")
            ) 
        }
        mBinding.btnRequirement.setOnClickListener {
            it.isEnabled = true
            startActivity(
                Intent(this@EpfOnlineMoney_11, EpfOnlineDetailMoney_12::class.java)
                    .putExtra("NineTag", "8")
            )
        }
        mBinding.btnTender.setOnClickListener {
            it.isEnabled = true
            startActivity(
                Intent(this@EpfOnlineMoney_11, EpfOnlineDetailMoney_12::class.java)
                    .putExtra("NineTag", "9")
            )
        }
        mBinding.btnRTI.setOnClickListener {
            it.isEnabled = true
            startActivity(
                Intent(this@EpfOnlineMoney_11, EpfOnlineDetailMoney_12::class.java)
                    .putExtra("NineTag", "10")
            )
        }
        mBinding.btnContactUs.setOnClickListener {
            it.isEnabled = true
            startActivity(
                Intent(this@EpfOnlineMoney_11, EpfOnlineDetailMoney_12::class.java)
                    .putExtra("NineTag", "11")
            )
        }
        mBinding.conToolbar.btnBack.setOnClickListener {

            onBackPressed()

        }
    }

    override fun onBackPressed() {
                    finish()
    }
}