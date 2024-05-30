package com.borrow.money.cash.loan.loanguide.adapterMoney.loantypeMoney

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.borrow.money.cash.loan.loanguide.activityMoney.descriptionMoney.LoanTypeDetailMoney_6
import com.borrow.money.cash.loan.loanguide.databinding.ItemLoanTypeBinding
import com.borrow.money.cash.loan.loanguide.model.TypesOfLoan

class CommonTypeMoneyAdapter(private var typesListing: ArrayList<TypesOfLoan>) :
    RecyclerView.Adapter<CommonTypeMoneyAdapter.ViewHolder>() {
    var context: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val binding =
            ItemLoanTypeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        context = parent.context
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val loan = typesListing[position]
        holder.binding.tvLoan.text = loan.name
        holder.binding.ivLoan.setImageResource(loan.image)

        holder.binding.relativeLoanType.setOnClickListener {

            it.isEnabled = false
                        it.isEnabled = true
                        val intent = Intent(context, LoanTypeDetailMoney_6::class.java)
                        intent.putExtra("LoanTypes", position)
                        intent.putExtra("description", loan.name)
                        context!!.startActivity(intent)

            
        }
    }

    override fun getItemCount(): Int {

        return typesListing.size
    }

    class ViewHolder(var binding: ItemLoanTypeBinding) : RecyclerView.ViewHolder(
        binding.root
    )

}






