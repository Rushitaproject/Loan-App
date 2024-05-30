package com.borrow.money.cash.loan.loanguide.activityMoney

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.activityMoney.descriptionMoney.DetailMoney_8
import com.borrow.money.cash.loan.loanguide.activityMoney.rewadMoney.ClaimMoney_9
import com.borrow.money.cash.loan.loanguide.databinding.MoneyEpfServiceBinding

class EpfServiceMoney_7 : AppCompatActivity() {
    private lateinit var mBinding: MoneyEpfServiceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyEpfServiceBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "Epf Service"

        mBinding.btnActivityUna.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@EpfServiceMoney_7, DetailMoney_8::class.java)
                                .putExtra("tag", "Activate UNA")
                                .putExtra("Five", "6")
                        )
        }
        mBinding.btnBalanceOnline.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@EpfServiceMoney_7, DetailMoney_8::class.java)
                                .putExtra("tag", "Balance(online)")
                                .putExtra("Five", "6")
                        )
        }
        mBinding.btnPensioners.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@EpfServiceMoney_7, DetailMoney_8::class.java)
                                .putExtra("tag", "Pensioners")
                                .putExtra("Five", "8")
                        )
        }
        mBinding.btnTrrnStatus.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@EpfServiceMoney_7, DetailMoney_8::class.java)
                                .putExtra("tag", "TRRN Status")
                                .putExtra("Five", "9")
                        )
        }
        mBinding.btnClaim.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(
                                this@EpfServiceMoney_7,
                                ClaimMoney_9::class.java
                            )
                        )
        }
        mBinding.btnBalanceCall.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@EpfServiceMoney_7, TipsMoney_10::class.java)
                                .putExtra("tag", "balance_online_2")
                        )
        }
        mBinding.btnBalanceSms.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@EpfServiceMoney_7, TipsMoney_10::class.java)
                                .putExtra("tag", "balance_online")
                        )

        }
        mBinding.btnFaq.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@EpfServiceMoney_7, DetailMoney_8::class.java)
                                .putExtra("tag", "FAQ")
                                .putExtra("Five", "10")
                        )
        }
        mBinding.btnLocateOffice.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@EpfServiceMoney_7, DetailMoney_8::class.java)
                                .putExtra("tag", "Locate Office")
                                .putExtra("Five", "4")
                        )


        }
        mBinding.btnHelpline.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@EpfServiceMoney_7, TipsMoney_10::class.java)
                                .putExtra("tag", "helpline")
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