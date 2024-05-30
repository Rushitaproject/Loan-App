package com.borrow.money.cash.loan.loanguide.adapterMoney.bankMoney

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.borrow.money.cash.loan.loanguide.activityMoney.descriptionMoney.BankNameDataMoney_31
import com.borrow.money.cash.loan.loanguide.databinding.ItemLoanKindBinding
import com.borrow.money.cash.loan.loanguide.model.BankType

class BankTypeMoneyAdapter(var bankListing: ArrayList<BankType>) :
    RecyclerView.Adapter<BankTypeMoneyAdapter.ViewHolder>() {
    var context: Context? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemLoanKindBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        context = parent.context
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val loan = bankListing[position]
        holder.binding.tvLoan.text = loan.name
        holder.binding.relativeLoanType.setOnClickListener {

            it.isEnabled = false
                        it.isEnabled = true
                        val intent = Intent(context, BankNameDataMoney_31::class.java)
                        intent.putExtra("TwentyEightNumber", loan.banknumber)
                        intent.putExtra("TwentyEightMini", loan.bankmini)
                        intent.putExtra("TwentyEightCare", loan.bankcare)
                        context!!.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return bankListing.size
    }

    class ViewHolder(var binding: ItemLoanKindBinding) : RecyclerView.ViewHolder(
        binding.root
    )
}