package com.borrow.money.cash.loan.loanguide.activityMoney

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.R
import com.borrow.money.cash.loan.loanguide.activityMoney.descriptionMoney.LoanDetailMoney_14
import com.borrow.money.cash.loan.loanguide.databinding.MoneyLoanInformBinding

class LoanInformMoney_13 : AppCompatActivity() {
    private lateinit var mBinding: MoneyLoanInformBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyLoanInformBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "Borrow Loan advise"

        mBinding.con.setOnClickListener {

                        it.isEnabled = true
                        startActivity(
                            Intent(this@LoanInformMoney_13, LoanDetailMoney_14::class.java)
                                .putExtra("jsonlink", resources.getString(R.string.text))
                                .putExtra("jsonname", resources.getString(R.string.title))
                        )


        }
        mBinding.con1.setOnClickListener {

                        it.isEnabled = true
                        startActivity(
                            Intent(this@LoanInformMoney_13, LoanDetailMoney_14::class.java)
                                .putExtra("jsonlink", resources.getString(R.string.text1))
                                .putExtra("jsonname", resources.getString(R.string.title1))
                        )


        }
        mBinding.con2.setOnClickListener {

                        it.isEnabled = true
                        startActivity(
                            Intent(this@LoanInformMoney_13, LoanDetailMoney_14::class.java)
                                .putExtra("jsonlink", resources.getString(R.string.text2))
                                .putExtra("jsonname", resources.getString(R.string.title2))
                        )


        }
        mBinding.con3.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@LoanInformMoney_13, LoanDetailMoney_14::class.java)
                                .putExtra("jsonlink", resources.getString(R.string.text3))
                                .putExtra("jsonname", resources.getString(R.string.title3))
                        )
        }
        mBinding.con4.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@LoanInformMoney_13, LoanDetailMoney_14::class.java)
                                .putExtra("jsonlink", resources.getString(R.string.text4))
                                .putExtra("jsonname", resources.getString(R.string.title4))
                        )
        }
        mBinding.con5.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@LoanInformMoney_13, LoanDetailMoney_14::class.java)
                                .putExtra("jsonlink", resources.getString(R.string.text5))
                                .putExtra("jsonname", resources.getString(R.string.title5))
                        )
        }
        mBinding.con6.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@LoanInformMoney_13, LoanDetailMoney_14::class.java)
                                .putExtra("jsonlink", resources.getString(R.string.text6))
                                .putExtra("jsonname", resources.getString(R.string.title6))
                        )
        }
        mBinding.con7.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@LoanInformMoney_13, LoanDetailMoney_14::class.java)
                                .putExtra("jsonlink", resources.getString(R.string.text7))
                                .putExtra("jsonname", resources.getString(R.string.title7))
                        )
        }
        mBinding.con8.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@LoanInformMoney_13, LoanDetailMoney_14::class.java)
                                .putExtra("jsonlink", resources.getString(R.string.text8))
                                .putExtra("jsonname", resources.getString(R.string.title8))
                        )
        }
        mBinding.con9.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@LoanInformMoney_13, LoanDetailMoney_14::class.java)
                                .putExtra("jsonlink", resources.getString(R.string.text9))
                                .putExtra("jsonname", resources.getString(R.string.title9))
                        )
        }
        mBinding.con10.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@LoanInformMoney_13, LoanDetailMoney_14::class.java)
                                .putExtra("jsonlink", resources.getString(R.string.text10))
                                .putExtra("jsonname", resources.getString(R.string.title10))
                        )
        }
        mBinding.con11.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@LoanInformMoney_13, LoanDetailMoney_14::class.java)
                                .putExtra("jsonlink", resources.getString(R.string.text11))
                                .putExtra("jsonname", resources.getString(R.string.title11))
                        )
        }
        mBinding.con12.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@LoanInformMoney_13, LoanDetailMoney_14::class.java)
                                .putExtra("jsonlink", resources.getString(R.string.text12))
                                .putExtra("jsonname", resources.getString(R.string.title12))
                        )
        }
        mBinding.con13.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@LoanInformMoney_13, LoanDetailMoney_14::class.java)
                                .putExtra("jsonlink", resources.getString(R.string.text13))
                                .putExtra("jsonname", resources.getString(R.string.title13))
                        )
        }
        mBinding.con14.setOnClickListener {
            it.isEnabled = false
                        it.isEnabled = true
                        startActivity(
                            Intent(this@LoanInformMoney_13, LoanDetailMoney_14::class.java)
                                .putExtra("jsonlink", resources.getString(R.string.text14))
                                .putExtra("jsonname", resources.getString(R.string.title14))
                        )
        }
        mBinding.con15.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@LoanInformMoney_13, LoanDetailMoney_14::class.java)
                                .putExtra("jsonlink", resources.getString(R.string.text15))
                                .putExtra("jsonname", resources.getString(R.string.title15))
                        )

        }
        mBinding.con16.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@LoanInformMoney_13, LoanDetailMoney_14::class.java)
                                .putExtra("jsonlink", resources.getString(R.string.text16))
                                .putExtra("jsonname", resources.getString(R.string.title16))
                        )
        }
        mBinding.con17.setOnClickListener {
                        it.isEnabled = true
                        startActivity(
                            Intent(this@LoanInformMoney_13, LoanDetailMoney_14::class.java)
                                .putExtra("jsonlink", resources.getString(R.string.text17))
                                .putExtra("jsonname", resources.getString(R.string.title17))
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