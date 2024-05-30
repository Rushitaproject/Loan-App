package com.borrow.money.cash.loan.loanguide.adapterMoney

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.borrow.money.cash.loan.loanguide.databinding.ItemLoanKindBinding
import com.borrow.money.cash.loan.loanguide.model.MapKind

class MapAdapter(var TwentySevenList: ArrayList<MapKind>) :
    RecyclerView.Adapter<MapAdapter.ViewHolder>() {
    var context: Context? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemLoanKindBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        context = parent.context
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val loan = TwentySevenList[position]
        holder.binding.tvLoan.text = loan.name
        holder.binding.relativeLoanType.setOnClickListener {
            val intent = Intent(
                "android.intent.action.VIEW",
                Uri.parse("https://www.google.co.in/maps/search/" + loan.name)
            )
            intent.setPackage("com.google.android.apps.maps")
            context!!.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return TwentySevenList.size
    }

    class ViewHolder(var binding: ItemLoanKindBinding) : RecyclerView.ViewHolder(
        binding.root
    )
}