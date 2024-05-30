package com.borrow.money.cash.loan.loanguide.activityMoney.calculatorMoney

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.R
import com.borrow.money.cash.loan.loanguide.databinding.MoneyExerciseemiDetailsBinding
import java.text.DecimalFormat

class EmiDetailsMoney_35 : AppCompatActivity() {
    private lateinit var mBinding: MoneyExerciseemiDetailsBinding
    private var G: Int = 0
    private var H: Float = 0f
    private var I: DecimalFormat? = null
    private var J: ArrayList<Float>? = null
    private var activity: Activity? = null
    private var bus: String? = null
    private var context: Context? = null
    private var emi: String? = null
    private var inter: String? = null
    private var inters: String? = null
    private var month: String? = null
    private var patala: String? = null
    private var princple: String? = null


    public override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        mBinding = MoneyExerciseemiDetailsBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)
        activity = this

        mBinding.conToolbar.heading.text = "EMI full info"
        mBinding.conToolbar.btnBack.setOnClickListener {
            onBackPressed()
        }

        val intent: Intent = intent
        patala = intent.getStringExtra("patala")
        inter = intent.getStringExtra("inter")
        emi = intent.getStringExtra("emi")
        princple = intent.getStringExtra("princple")
        inters = intent.getStringExtra("inters")
        month = intent.getStringExtra("month")
        bus = intent.getStringExtra("bus")
        G = patala(month!!.toFloat()).toInt()
        val patala: StringBuilder = patala("")
        patala.append(month!!.toFloat())
        patala.toString()
        J = ArrayList()
        val valueOf: String = inter.toString()
        J!!.add(java.lang.Float.valueOf(valueOf))
        val valueOf2: String = princple.toString()
        J!!.add(java.lang.Float.valueOf(valueOf2))
        H = java.lang.Float.valueOf(princple.toString())
        J!!.add(java.lang.Float.valueOf(valueOf))
        J!!.add(java.lang.Float.valueOf(valueOf2))

        val patala2: StringBuilder = patala("")
        patala2.append(Math.round(princple!!.toFloat()))
        mBinding.loanA.text = patala2.toString()

        val patala3: StringBuilder = patala("")
        patala3.append(Math.round(inter!!.toFloat()))
        mBinding.interBtn.text = patala3.toString()

        val patala4: StringBuilder = patala("")
        patala4.append(Math.round(emi!!.toFloat()))
        mBinding.emiBtn.text = patala4.toString()

        val patala5: StringBuilder = patala("")
        patala5.append(Math.round(this.patala!!.toFloat()))
        mBinding.emiBtn1.text = patala5.toString()

        val patala6: StringBuilder = patala("")
        patala6.append(G)
        mBinding.monthBtn.text = patala6.toString()

        val patala7: StringBuilder = patala("")
        patala7.append(Math.round(inters!!.toFloat()))
        mBinding.totalIntere.text = patala7.toString()
        val relativeLayout: RelativeLayout =
            findViewById<View>(R.id.PrincipanLoanAmount) as RelativeLayout
        val relativeLayout2: RelativeLayout =
            findViewById<View>(R.id.IntrestAmount) as RelativeLayout
        if (Build.VERSION.SDK_INT >= 24) {
            I = DecimalFormat("##,##,##,##,###")
        }
        
        mBinding.chart.setUsePercentValues(true)
        mBinding.chart.description.isEnabled = false
        mBinding.chart.setExtraOffsets(5.0f, 10.0f, 5.0f, 5.0f)
        mBinding.chart.dragDecelerationFrictionCoef = 0.95f
        mBinding.chart.centerText = "EMI LOAN"
        mBinding.chart.setExtraOffsets(20.0f, 0.0f, 20.0f, 0.0f)
        mBinding.chart.isDrawHoleEnabled = true
        mBinding.chart.setHoleColor(-1)
        mBinding.chart.setTransparentCircleColor(-3355444)
        mBinding.chart.setTransparentCircleAlpha(110)
        mBinding.chart.holeRadius = 58.0f
        mBinding.chart.transparentCircleRadius = 61.0f
        mBinding.chart.setDrawCenterText(true)
        mBinding.chart.rotationAngle = 0.0f
        mBinding.chart.isRotationEnabled = true
        mBinding.chart.isHighlightPerTapEnabled = true
        val f: Float = H
        val arrayList: ArrayList<*> = ArrayList<Any?>()


        mBinding.chart.invalidate()
    }

    fun patala(f: Float): Float {
        val f2: Float = f * 12.0f
        f2.toString()
        return f2
    }

    override fun onBackPressed() {
            finish()
    }

    companion object {
        fun patala(str: String?): StringBuilder {
            val sb: StringBuilder = StringBuilder()
            sb.append(str)
            return sb
        }


    }
}