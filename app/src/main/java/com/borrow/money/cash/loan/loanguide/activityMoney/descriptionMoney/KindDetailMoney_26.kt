package com.borrow.money.cash.loan.loanguide.activityMoney.descriptionMoney

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.databinding.MoneyKindDetailBinding

class KindDetailMoney_26 : AppCompatActivity() {
    private lateinit var mBinding: MoneyKindDetailBinding
    var SixteenPosition = 0
    var SixteenData: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyKindDetailBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "Information"

        if (intent != null) {
            SixteenPosition = intent.getIntExtra("SixteenType", 0)
        }
        when (SixteenPosition) {
            0 -> SixteenData =
                "If you need a loan quickly, a personal loan may be an option for you.  A personal loan (or personal loan) is an unsecured loan and you get it quickly.  But yes, one can expect the interest rate of a personal loan to be higher than a secured loan.  Let us know in detail about personal loans.  First of all, a personal loan is available very quickly, some even claim that they will give you a loan in a few minutes.  Do not just go to claims.  But yes, you can expect to get a loan soon.  Secondly, a personal loan is an unsecured loan.  That is why you do not need to keep some pledge (security).  This is also one of the reasons for getting loan early.  Because less documents are required, that is why the loan is available sooner."

            1 -> SixteenData =
                "Generally you take a home loan for buying a house / flat, plot or construction / renovation.  Sometimes home loan is also taken to increase or repair the house.  We are giving you all the necessary information about the home loan here.  Before starting the home loan process, assess the amount of money that you can earn and how much the banks can loan accordingly. Your ability to take a home loan depends on the capacity to repay it.  .  It depends on your monthly earnings, expenses and family's earnings, assets, liabilities, income stability.  Banks first see if you will be able to repay the home loan on time.  The more money you get in your hands every month, the more the amount of your home loan will increase."

            2 -> SixteenData =
                "To promote small enterprises in the country, the government has introduced several loan schemes.  Apart from the Pradhan Mantri Mudra Yojana, there are many other schemes in which you can take small loans to big loans.  At this time, according to the schemes of the central and state government, you can take a loan from Rs 50,000 to n lakh for your business.  In fact, banks decide to give you a loan according to your business plan.  If the bank feels that your business and profits from it will be so much that you will be able to repay the loan of the bank within the stipulated period after completing your expenses, only then the bank approves your loan.  What are the benefits of taking a business loan?  Financial support for inward business needs of cash, financial needs to be met for both short and long term"

            3 -> SixteenData =
                "Quality education is very important for a person\\'s complete and successful life.  For some people, it may be a graduation from a top institute.  At a time when the cost of studies is constantly increasing, the cost of studying in the top institutes of the country and abroad is quite high.  Keeping this in mind, parents invest in mutual funds, some fixed deposits and some resort to ULIPs.  Even after all this, the amount may be less for your studies.  In the form of education loan, you get a lot of help in such situations.  This loan fills the gap between your need and the money available.  According to a study, the cost of studying is increasing at the rate of 15 percent annually.  At this time, if the cost of studies is Rs 2.5 lakh, then after 15 years, it will cost 20 lakh rupees to do MBA."

            4 -> SixteenData =
                "It is everyone\\'s dream to take a branded car with them.  A car not only makes your life comfortable, but also reduces many difficulties.  Reaching the office while battling public transport or going out for weekends, everything becomes very easy.  Earlier, buying a car was a big thing for anyone, because it had to spend a lump sum, but now it is very easy due to the easy availability of a car loan.  Banks and non-banking finance companies offer car loans on easy monthly installments, which has made it very easy to buy cars now.  Due to this, your budget is not deteriorated and convenience is also provided."

            5 -> SixteenData =
                "Many times we need money in emergency.  In such a situation, sleeping in the house can be quite useful.  Companies like Manapuram Finance, Muthoot Finance, IIFL offer gold loans.  Some government and private sector banks also offer gold loans.  You can take cash by pledging gold ornaments, coins etc.  After repaying this money, the pledged jewelery or gold is returned to the customer, after which the interest on the loan amount has to be paid.  Gold loan has lower interest rate than personal loan.  Personal .. How much interest do you think?  Finance companies and bank interest rates are different for gold loans.  These range from n percent to 15 percent.  For example, ICICI Bank charges interest on gold loans ranging from n percent to 16.50 percent annually.  Along with this, one percent processing fee is also charged."
        }
        mBinding.tvDec1.text = SixteenData
        mBinding.conToolbar.btnBack.setOnClickListener {

            onBackPressed()
        }
    }

    override fun onBackPressed() {
                    finish()
    }
}