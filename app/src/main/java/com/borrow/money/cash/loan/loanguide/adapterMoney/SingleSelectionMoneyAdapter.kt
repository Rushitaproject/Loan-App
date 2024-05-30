package com.borrow.money.cash.loan.loanguide.adapterMoney


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.graphics.drawable.DrawableCompat
import androidx.recyclerview.widget.RecyclerView
import com.borrow.money.cash.loan.loanguide.R
import com.borrow.money.cash.loan.loanguide.model.CountryItem
import de.hdodenhof.circleimageview.CircleImageView


class SingleSelectionMoneyAdapter(private val context: Context, employees: ArrayList<CountryItem>) :
    RecyclerView.Adapter<SingleSelectionMoneyAdapter.SingleViewHolder>() {
    private var employees: ArrayList<CountryItem>

    // if checkedPosition = -1, there is no default selection
    // if checkedPosition = 0, 1st item is selected by default
    private var checkedPosition = 0

    init {
        this.employees = employees
    }

    fun setEmployees(employees: ArrayList<CountryItem>) {
        this.employees = ArrayList()
        this.employees = employees
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): SingleViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.item_country, viewGroup, false)
        return SingleViewHolder(view)
    }

    override fun onBindViewHolder(singleViewHolder: SingleViewHolder, position: Int) {
        singleViewHolder.bind(employees[position])
    }

    override fun getItemCount(): Int {
        return employees.size
    }

    inner class SingleViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        private val textView: AppCompatTextView
        private val imageView: CircleImageView
        private val singleItem: ConstraintLayout

        init {
            textView = itemView.findViewById<AppCompatTextView>(R.id.countryName)
            imageView = itemView.findViewById<CircleImageView>(R.id.countryFlag)
            singleItem = itemView.findViewById<ConstraintLayout>(R.id.singleItem)
        }

        fun bind(employee: CountryItem) {
            textView.isSelected = true
            if (checkedPosition == -1) {
                var buttonDrawable = singleItem.background
                buttonDrawable = DrawableCompat.wrap(buttonDrawable!!)
                DrawableCompat.setTint(
                    buttonDrawable,
                    context.resources.getColor(R.color.colorPrimary)
                )
                textView.setTextColor(context.resources.getColor(R.color.black))
                singleItem.background = buttonDrawable
            } else {
                if (checkedPosition == adapterPosition) {
                    var buttonDrawable = singleItem.background
                    buttonDrawable = DrawableCompat.wrap(buttonDrawable!!)
                    DrawableCompat.setTint(
                        buttonDrawable,
                        context.resources.getColor(R.color.colorPrimary)
                    )
                    textView.setTextColor(context.resources.getColor(R.color.black))
                    singleItem.background = buttonDrawable
                } else {
                    var buttonDrawable = singleItem.background
                    buttonDrawable = DrawableCompat.wrap(buttonDrawable!!)
                    DrawableCompat.setTint(
                        buttonDrawable,
                        context.resources.getColor(R.color.colorSecondary)
                    )
                    textView.setTextColor(context.resources.getColor(R.color.black))
                    singleItem.background = buttonDrawable
                }
            }
            textView.text = employee.countryItem
            imageView.setImageResource(employee.flagItem)
            itemView.setOnClickListener {
                var buttonDrawable = singleItem.background
                buttonDrawable = DrawableCompat.wrap(buttonDrawable!!)
                DrawableCompat.setTint(
                    buttonDrawable!!,
                    context.resources.getColor(R.color.colorPrimary)
                )
                textView.setTextColor(context.resources.getColor(R.color.white))
                singleItem.background = buttonDrawable
                if (checkedPosition != adapterPosition) {
                    notifyItemChanged(checkedPosition)
                    checkedPosition = adapterPosition
                }
            }
        }
    }

    val selected: CountryItem?
        get() = if (checkedPosition != -1) {
            employees[checkedPosition]
        } else null
}