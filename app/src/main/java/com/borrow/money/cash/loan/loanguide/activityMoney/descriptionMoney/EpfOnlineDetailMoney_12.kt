package com.borrow.money.cash.loan.loanguide.activityMoney.descriptionMoney

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.R
import com.borrow.money.cash.loan.loanguide.databinding.MoneyEpfOnlineDetailBinding


class EpfOnlineDetailMoney_12 : AppCompatActivity() {
    private lateinit var mBinding: MoneyEpfOnlineDetailBinding
    var strNineTag: String? = null
    var strNineCopy: String? = null
    var strNineVisitLink: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyEpfOnlineDetailBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)


        mBinding.conToolbar.heading.text = "Information"

        strNineTag = intent.getStringExtra("NineTag")
        if (strNineTag == "0") {
            mBinding.textAnsware.text = resources.getString(R.string.epf_online_title1_detail)
            mBinding.textQuestion.text = "Check Your EPF"
            strNineCopy = "https://epfindia.gov.in/site_en/index.php"
            strNineVisitLink = "https://epfindia.gov.in/site_en/index.php"
        } else if (strNineTag == "1") {
            mBinding.textAnsware.text = resources.getString(R.string.epf_online_title2_detail)
            mBinding.textQuestion.text = "Claim"
            strNineCopy = "https://www.epfindia.gov.in/site_en/Downloads.php?id=sm8_index"
            strNineVisitLink = "https://www.epfindia.gov.in/site_en/Downloads.php?id=sm8_index"
        } else if (strNineTag == "2") {
            mBinding.textAnsware.text = resources.getString(R.string.epf_online_title3_detail)
            mBinding.textQuestion.text = "E-Passbood"
            strNineCopy = "https://passbook.epfindia.gov.in/MemberPassBook/Login.jsp"
            strNineVisitLink = "https://passbook.epfindia.gov.in/MemberPassBook/Login.jsp"
        } else if (strNineTag == "3") {
            mBinding.textAnsware.text = resources.getString(R.string.epf_online_title4_detail)
            mBinding.textQuestion.text = "E-Passbood"
            strNineCopy = "https://passbook.epfindia.gov.in/MemberPassBook/Login.jsp"
            strNineVisitLink = "https://passbook.epfindia.gov.in/MemberPassBook/Login.jsp"
        } else if (strNineTag == "4") {
            mBinding.textAnsware.text = resources.getString(R.string.epf_online_title5_detail)
            mBinding.textQuestion.text = "E-Passbood"
            strNineCopy = "https://passbook.epfindia.gov.in/MemberPassBook/Login.jsp"
            strNineVisitLink = "https://passbook.epfindia.gov.in/MemberPassBook/Login.jsp"
        } else if (strNineTag == "5") {
            mBinding.textAnsware.text = resources.getString(R.string.epf_online_title6_detail)
            mBinding.textQuestion.text = "E-Passbood"
            strNineCopy = "https://passbook.epfindia.gov.in/MemberPassBook/Login.jsp"
            strNineVisitLink = "https://passbook.epfindia.gov.in/MemberPassBook/Login.jsp"
        } else if (strNineTag == "6") {
            mBinding.textAnsware.text = resources.getString(R.string.epf_online_title7_detail)
            mBinding.textQuestion.text = "Download"
            strNineCopy = "https://epfindia.gov.in/site_en/index.php"
            strNineVisitLink = "https://epfindia.gov.in/site_en/index.php"
        } else if (strNineTag == "7") {
            mBinding.textAnsware.text = resources.getString(R.string.epf_online_title8_detail)
            mBinding.textQuestion.text = "Downloads"
            strNineCopy = "https://www.epfindia.gov.in/site_en/Downloads.php?id=sm8_index"
            strNineVisitLink = "https://www.epfindia.gov.in/site_en/Downloads.php?id=sm8_index"
        } else if (strNineTag == "8") {
            mBinding.textAnsware.text = resources.getString(R.string.epf_online_title9_detail)
            mBinding.textQuestion.text = "Recuirement"
            strNineCopy = "https://www.epfindia.gov.in/site_en/Recruitments.php"
            strNineVisitLink = "https://www.epfindia.gov.in/site_en/Recruitments.php"
        } else if (strNineTag == "9") {
            mBinding.textAnsware.text = resources.getString(R.string.epf_online_title10_detail)
            mBinding.textQuestion.text = "Tender"
            strNineCopy = "https://www.epfindia.gov.in/site_en/Tender_Auction.php?id=sm10_index"
            strNineVisitLink =
                "https://www.epfindia.gov.in/site_en/Tender_Auction.php?id=sm10_index"
        } else if (strNineTag == "10") {
            mBinding.textAnsware.text = resources.getString(R.string.epf_online_title11_detail)
            mBinding.textQuestion.text = "R.T.I"
            strNineCopy = "https://www.epfindia.gov.in/site_en/RTI.php?id=sm12_index"
            strNineVisitLink = "https://www.epfindia.gov.in/site_en/RTI.php?id=sm12_index"
        } else if (strNineTag == "11") {
            mBinding.textAnsware.text = resources.getString(R.string.epf_online_title12_detail)
            mBinding.textQuestion.text = "Contact Us"
            strNineCopy = "https://www.epfindia.gov.in/site_en/Contact_us.php"
            strNineVisitLink = "https://www.epfindia.gov.in/site_en/Contact_us.php"
        }
        mBinding.btnVisitLink.setOnClickListener {
                        it.isEnabled = true
                        val viewIntent = Intent(
                            "android.intent.action.VIEW",
                            Uri.parse(strNineVisitLink)
                        )
                        startActivity(viewIntent)
        }
        mBinding.btnCopyLink.setOnClickListener {
                        it.isEnabled = true
                        (getSystemService(CLIPBOARD_SERVICE) as ClipboardManager).setPrimaryClip(
                            ClipData.newPlainText("copy_link", strNineCopy)
                        )
                        Toast.makeText(
                            this@EpfOnlineDetailMoney_12,
                            "Number Copy",
                            Toast.LENGTH_SHORT
                        ).show()
        }
        mBinding.conToolbar.btnBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
                    finish()
    }
}