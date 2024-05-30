package com.borrow.money.cash.loan.loanguide.adapterMoney.loantypeMoney

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.borrow.money.cash.loan.loanguide.activityMoney.aadharMoney.AadharLoanMoney_18
import com.borrow.money.cash.loan.loanguide.activityMoney.bikeMoney.BikeLoanfoMoney_24
import com.borrow.money.cash.loan.loanguide.activityMoney.cardMoney.CreditCardMoney_22
import com.borrow.money.cash.loan.loanguide.activityMoney.descriptionMoney.KindDetailMoney_26
import com.borrow.money.cash.loan.loanguide.activityMoney.panMoney.PanCardMoney_20
import com.borrow.money.cash.loan.loanguide.databinding.ItemLoanTypeBinding
import com.borrow.money.cash.loan.loanguide.model.TypesOfLoan

class DiscountMoneyAdapter(var FifteenList: ArrayList<TypesOfLoan>) :
    RecyclerView.Adapter<DiscountMoneyAdapter.ViewHolder>() {
    var context: Context? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemLoanTypeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        context = parent.context
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val loan = FifteenList[position]
        holder.binding.tvLoan.text = loan.name
        holder.binding.tvLoan.isSelected = true
        holder.binding.ivLoan.setImageResource(loan.image)
        holder.binding.relativeLoanType.setOnClickListener {
                        it.isEnabled = true
                        if (loan.name == "Aadhar Loan") {
                            context!!.startActivity(
                                Intent(
                                    context,
                                    AadharLoanMoney_18::class.java
                                )
                            )
                        } else if (loan.name == "PAN Card Download") {
                            context!!.startActivity(
                                Intent(
                                    context,
                                    PanCardMoney_20::class.java
                                )
                            )
                        } else if (loan.name == "Credit Card Loan advise") {
                            context!!.startActivity(
                                Intent(
                                    context,
                                    CreditCardMoney_22::class.java
                                )
                            )
                        } else if (loan.name == "Bike Loan advise") {
                            context!!.startActivity(
                                Intent(
                                    context,
                                    BikeLoanfoMoney_24::class.java
                                )
                            )
                        } else {
                            val intent = Intent(context, KindDetailMoney_26::class.java)
                            intent.putExtra("SixteenType", position)
                            context!!.startActivity(intent)
                        }

            
            
            
        }
    }

    override fun getItemCount(): Int {
        return FifteenList.size
    }

    class ViewHolder(var binding: ItemLoanTypeBinding) : RecyclerView.ViewHolder(
        binding.root
    )
}