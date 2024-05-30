package com.borrow.money.cash.loan.loanguide.adapterMoney.bankMoney

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.borrow.money.cash.loan.loanguide.R
import com.borrow.money.cash.loan.loanguide.activityMoney.descriptionMoney.BankDetailMoney_33
import com.borrow.money.cash.loan.loanguide.databinding.BankItemBinding
import com.borrow.money.cash.loan.loanguide.model.BankType

class BankSelectionMoneyAdapter(var bankListing: ArrayList<BankType>) :
    RecyclerView.Adapter<BankSelectionMoneyAdapter.ViewHolder>() {
    var context: Context? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = BankItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        context = parent.context
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val loan = bankListing[position]
        holder.binding.textTitle.text = loan.name
        var colorRes = 0
        when (position % 7) {
            0 -> colorRes = R.color.list_color1
            1 -> colorRes = R.color.list_color2
            2 -> colorRes = R.color.list_color3
            3 -> colorRes = R.color.list_color4
            4 -> colorRes = R.color.list_color5
            5 -> colorRes = R.color.list_color6
            6 -> colorRes = R.color.list_color7
        }
        holder.binding.textFirstTitle.setTextColor(ContextCompat.getColor(context!!, colorRes))
        holder.binding.textFirstTitle.text = loan.name!!.substring(0, 1)
        holder.binding.conBak.setOnClickListener {

            it.isEnabled = false
                        it.isEnabled = true
                        val intent = Intent(context, BankDetailMoney_33::class.java)
                        intent.putExtra("name", loan.name)
                        intent.putExtra("number", loan.banknumber)
                        intent.putExtra("care", loan.bankcare)
                        context!!.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return bankListing.size
    }

    class ViewHolder(var binding: BankItemBinding) : RecyclerView.ViewHolder(
        binding.root
    )
}