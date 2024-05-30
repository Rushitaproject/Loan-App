package com.borrow.money.cash.loan.loanguide.adapterMoney.loantypeMoney

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.borrow.money.cash.loan.loanguide.activityMoney.aadharMoney.AAdharInfoMoney_19
import com.borrow.money.cash.loan.loanguide.databinding.ItemLoanKindBinding
import com.borrow.money.cash.loan.loanguide.model.LoanKind

class AadharMoneyAdapter(var kindListing: ArrayList<LoanKind>) :
    RecyclerView.Adapter<AadharMoneyAdapter.ViewHolder>() {
    var context: Context? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemLoanKindBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        context = parent.context
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val loan = kindListing[position]
        holder.binding.tvLoan.text = loan.name
        holder.binding.tvLoan.isSelected = true
        holder.binding.relativeLoanType.setOnClickListener {
            it.isEnabled = false
                        it.isEnabled = true
                        val intent = Intent(context, AAdharInfoMoney_19::class.java)
                        intent.putExtra("EighteenType", position)
                        context!!.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return kindListing.size
    }

    class ViewHolder(var binding: ItemLoanKindBinding) : RecyclerView.ViewHolder(
        binding.root
    )
}