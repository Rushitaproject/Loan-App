package com.borrow.money.cash.loan.loanguide.activityMoney.calculatorMoney

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.R
import com.borrow.money.cash.loan.loanguide.databinding.MoneyEmiCalBinding
import com.borrow.money.cash.loan.loanguide.utility.PrefManaging
import java.text.DecimalFormat

class EmiCalMoney_34 : AppCompatActivity() {
    private lateinit var mBinding: MoneyEmiCalBinding
    var activity: Activity? = null
    var context: Context? = null
    var flot5 = 0f
    var flot6 = 0f
    var i = 0
    var string_inters: String? = null
    var string_month: String? = null
    var string_princple: String? = null
    var string_toolname: String? = null


    public override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        mBinding = MoneyEmiCalBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)
        activity = this

        mBinding.conToolbar.heading.text = "Calculate your allEMI"
        string_toolname = "EMI"

        mBinding.conToolbar.btnBack.setOnClickListener(View.OnClickListener {

            onBackPressed()
        })


        DecimalFormat("0.00")
        mBinding.yearBt.setOnClickListener {
            mBinding.yearBt.setTextColor(resources.getColor(R.color.redColor))
            mBinding.montId.setTextColor(resources.getColor(R.color.black))

            string_month = mBinding.yearBtn.text.toString().trim { it <= ' ' }
            if ((string_month == "")) {
                mBinding.yearBtn.hint = "Months"
            } else {
                flot6 =
                    calculat(string_month!!.toFloat())
                val calculat = calculat("")
                calculat.append(string_month!!.toFloat())
                calculat.toString()
                i = flot6.toInt()
                val calculat2 = calculat("")
                calculat2.append(i)
                mBinding.yearBtn.setText(calculat2.toString())
            }
            val calculat3 = calculat("")
            calculat3.append(i)
            calculat3.toString()
        }
        mBinding.montId.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                mBinding.yearBt.setTextColor(resources.getColor(R.color.black))
                mBinding.montId.setTextColor(resources.getColor(R.color.redColor))

                string_month = mBinding.yearBtn.text.toString().trim { it <= ' ' }
                if ((string_month == "")) {
                    mBinding.yearBtn.hint = "Year"
                    return
                }

                flot5 = year_bt(string_month!!.toFloat())
                val calculat = calculat("")
                calculat.append(flot5)
                mBinding.yearBtn.setText(calculat.toString())
                flot5.toString()
            }
        })
        mBinding.reset.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                mBinding.primeAmount.setText("")
                mBinding.interestBtn.setText("")
                mBinding.yearBtn.setText("")
                mBinding.month.setText("")
            }
        })

        mBinding.calculat.setOnClickListener {
            it.isEnabled = false
            Calculation(it)
        }
    }

    fun calculat(f: Float): Float {
        val f2 = f * 12.0f
        f2.toString()
        return f2
    }

    fun year_bt(f: Float): Float {
        val f2 = f / 12.0f
        f2.toString()
        return f2
    }


    fun Calculation(view: View) {
        string_princple = mBinding.primeAmount.text.toString().trim { it <= ' ' }
        string_inters = mBinding.interestBtn.text.toString().trim { it <= ' ' }
        string_month = mBinding.yearBtn.text.toString().trim { it <= ' ' }
        if ((string_princple == "")) {
            mBinding.primeAmount.error = "Please Enter Amount"
        } else if ((string_inters == "")) {
            mBinding.interestBtn.error = "Please Enter Interest"
        } else if ((string_month == "")) {
            mBinding.yearBtn.error = "Please Enter Year & Month"
        } else {
            val parseInt = (string_princple.toString().toFloat() / 100).toDouble()
            java.lang.Double.isNaN(parseInt)
            val parseFloat = (string_month.toString().toFloat() * 12.0f).toDouble()
            java.lang.Double.isNaN(parseFloat)
            val parseInt2 = parseInt * (string_inters.toString().toFloat() / 12.0) * parseFloat
            val formatAmount = PrefManaging.formatAmount(parseInt2)
            val parseInt3 = string_princple.toString().toFloat().toDouble()
            java.lang.Double.isNaN(parseInt3)
            val d = parseInt3 + parseInt2
            val formatAmount2 = PrefManaging.formatAmount(d)
            val d2 = d / parseFloat
                        view.isEnabled = true
                        val intent = Intent(activity, EmiDetailsMoney_35::class.java)
                        intent.putExtra("patala", formatAmount2)
                        intent.putExtra("inter", formatAmount)
                        intent.putExtra("emi", d2.toString())
                        intent.putExtra("princple", "" + string_princple)
                        intent.putExtra("month", "" + string_month)
                        intent.putExtra("inters", "" + string_inters)
                        intent.putExtra("bus", string_toolname)
                        startActivity(intent)
        }
    }

    override fun onBackPressed() {
                    finish()
    }

    companion object {
        fun calculat(str: String?): StringBuilder {
            val sb = StringBuilder()
            sb.append(str)
            return sb
        }
    }
}