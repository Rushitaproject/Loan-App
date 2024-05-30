package com.borrow.money.cash.loan.loanguide.activityMoney.mapMoney

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.borrow.money.cash.loan.loanguide.adapterMoney.MapAdapter
import com.borrow.money.cash.loan.loanguide.databinding.MoneyNearMeBinding
import com.borrow.money.cash.loan.loanguide.model.MapKind

class NearMeMoney_29 : AppCompatActivity() {
    private lateinit var mBinding: MoneyNearMeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyNearMeBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "Near By places"

        val mapListing = ArrayList<MapKind>()
        mapListing.add(MapKind("Atm"))
        mapListing.add(MapKind("Art"))
        mapListing.add(MapKind("Bars"))
        mapListing.add(MapKind("Banks"))
        mapListing.add(MapKind("Beauty salons"))
        mapListing.add(MapKind("Book Stores"))
        mapListing.add(MapKind("Convenience"))
        mapListing.add(MapKind("Clothes"))
        mapListing.add(MapKind("Coffee"))
        mapListing.add(MapKind("Car Dealers"))
        mapListing.add(MapKind("Delivery"))
        mapListing.add(MapKind("Dry Cleaning"))
        mapListing.add(MapKind("Electronics"))
        mapListing.add(MapKind("Gas"))
        mapListing.add(MapKind("Gym"))
        mapListing.add(MapKind("Groceries"))
        mapListing.add(MapKind("Hospitals"))
        mapListing.add(MapKind("Hotels"))
        mapListing.add(MapKind("Home And Garden"))
        mapListing.add(MapKind("Jewelry"))
        mapListing.add(MapKind("Libraries"))
        mapListing.add(MapKind("Parking"))
        mapListing.add(MapKind("Pharmacies"))
        mapListing.add(MapKind("Parks"))
        mapListing.add(MapKind("Restaurants"))
        mapListing.add(MapKind("Stadium"))
        mapListing.add(MapKind("Shopping Centers"))
        val loanTypeRV = MapAdapter(mapListing)
        val gridLayoutManager = GridLayoutManager(this, 1)
        mBinding.recyclerLoanType.setHasFixedSize(true)
        mBinding.recyclerLoanType.layoutManager = gridLayoutManager
        mBinding.recyclerLoanType.adapter = loanTypeRV
        mBinding.conToolbar.btnBack.setOnClickListener {

            onBackPressed()
        }
    }

    override fun onBackPressed() {
                    finish()
    }
}