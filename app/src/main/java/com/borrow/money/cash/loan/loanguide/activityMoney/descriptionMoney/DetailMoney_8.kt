package com.borrow.money.cash.loan.loanguide.activityMoney.descriptionMoney

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Intent
import android.content.res.Resources
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.R
import com.borrow.money.cash.loan.loanguide.databinding.MoneyDetailBinding

class DetailMoney_8 : AppCompatActivity() {
    private lateinit var mBinding: MoneyDetailBinding
    var FiveName: String? = null
    var FivelinkType: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyDetailBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)


        mBinding.conToolbar.heading.text = "Detail"

        if (intent != null) {
            FiveName = intent.getStringExtra("tag")
            FivelinkType = intent.getStringExtra("Five")
        }
        mBinding.textQuestion.text = FiveName
        var resources: Resources? = null
        var i = 0

        var string: String? = null

        if (FiveName != "1") {

            if (FiveName != "2" && FiveName != "3") {
                if (FiveName == "4") {
                    string = "https://unifiedportal-emp.epfindia.gov.in/epfo/"
                } else if (FiveName == "5") {
                    string = "https://epfindia.gov.in/site_en/index.php"
                } else if (FiveName == "6") {
                    string = "https://passbook.epfindia.gov.in/MemberPassBook/Login.jsp"
                } else if (FiveName == "7") {
                    string = "https://return.shramsuvidha.gov.in/user/login"
                } else if (FiveName == "8") {
                    string = "https://mis.epfindia.gov.in/PensionPaymentEnquiry/enquiry.jsp"
                } else if (FiveName == "9") {
                    string = "https://iwu.epfindia.gov.in/iwu/"
                } else if (FiveName == "10") {
                    string =
                        "https://www6.mypfbalance.com/?template=ARROW_3&tdfs=0&s_token=1693042401.0126960000&uuid=1693042401.0126960000&term=EPF%20Account%20Balance%20Management&term=Securely%20Transfer%20Money&term=Employee%20Satisfaction%20Surveys&searchbox=0&showDomain=0&backfill=0"
                } else if (FiveName == "11") {
                    string = "https://www.epfindia.gov.in/site_en/Downloads.php?id=sm8_index"
                } else {
                    if (FiveName != "your_Claim" && FiveName != "member_claim" && FiveName != "apply_claim") {
                        if (FiveName == "Activate UNA") {
                            resources = getResources()
                            i = R.string.link_Activate_UAN
                            mBinding.textAnsware.setText(R.string.Activate_UNA)
                        } else if (FiveName == "Pensioners") {
                            resources = getResources()
                            i = R.string.link_Pensioners
                            mBinding.textAnsware.setText(R.string.Pensioners)
                        } else if (FiveName == "TRRN Status") {
                            resources = getResources()
                            i = R.string.link_TRRN_status
                            mBinding.textAnsware.setText(R.string.TRRN_Status)
                        } else if (FiveName == "FAQ") {
                            resources = getResources()
                            i = R.string.link_FAQs
                            mBinding.textAnsware.setText(R.string.FAQ)
                        } else if (FiveName == "News") {
                            resources = getResources()
                            i = R.string.link_News
                        } else if (FiveName == "Locate Office") {
                            resources = getResources()
                            i = R.string.link_Locate_Office
                            mBinding.textAnsware.setText(R.string.locate_office)
                        } else if (FiveName == "Balance(online)") {
                            resources = getResources()
                            i = R.string.link_BalanceOnline
                            mBinding.textAnsware.setText(R.string.balance_online)
                        } else if (FiveName == "YourClaimStatus") {
                            resources = getResources()
                            i = R.string.link_Check_Your_EPF
                            mBinding.textAnsware.setText(R.string.YourClaimStatus)
                        } else if (FiveName == "Member Claim Status") {
                            resources = getResources()
                            i = R.string.cliam_link
                            mBinding.textAnsware.setText(R.string.YourClaimStatus)
                        } else if (FiveName == "Apply For Claim") {
                            resources = getResources()
                            i = R.string.link_Online_Transfer_Claims_Portal_OTCP
                            mBinding.textAnsware.setText(R.string.YourClaimStatus)
                        } else if (FiveName == "epf_online_title4_detail") {
                            resources = getResources()
                            i = R.string.link_Member_Passbook
                        } else if (FiveName == "epf_online_title5_detail") {
                            resources = getResources()
                            i = R.string.link_Download_Claim_Form
                        } else if (FiveName == "epf_online_title6_detail") {
                            resources = getResources()
                            i = R.string.link_Multiple_PF_Accounts_of_an_Employee
                        } else if (FiveName == "epf_online_title7_detail") {
                            resources = getResources()
                            i = R.string.link_E_Passbook
                        } else if (FiveName == "epf_online_title8_detail") {
                            resources = getResources()
                            i = R.string.link_Downloads
                        } else if (FiveName == "epf_online_title9_detail") {
                            resources = getResources()
                            i = R.string.link_Recruitments
                        } else if (FiveName == "epf_online_title10_detail") {
                            resources = getResources()
                            i = R.string.linnk_Tenders
                        } else if (FiveName == "epf_online_title11_detail") {
                            resources = getResources()
                            i = R.string.link_RTI
                        } else if (FiveName == "epf_online_title12_detail") {
                            resources = getResources()
                            i = R.string.link_contact_US
                        }
                        string = resources!!.getString(i)
                    }
                }

            }

        }


        val finalString = string
        mBinding.btnCopyLink.setOnClickListener {
                        it.isEnabled = true
                        (getSystemService(CLIPBOARD_SERVICE) as ClipboardManager)
                            .setPrimaryClip(ClipData.newPlainText("text", finalString))
                        Toast.makeText(
                            this@DetailMoney_8,
                            "Text Copy To Clipboard...",
                            Toast.LENGTH_SHORT
                        ).show()
        }
        mBinding.btnVisitLink.setOnClickListener {
                        it.isEnabled = true
                        val viewIntent = Intent(
                            "android.intent.action.VIEW",
                            Uri.parse(finalString)
                        )
                        startActivity(viewIntent)

        }
        mBinding.conToolbar.btnBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
                    finish()
    }
}