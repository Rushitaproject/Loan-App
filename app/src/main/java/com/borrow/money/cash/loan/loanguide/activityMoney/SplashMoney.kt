package com.borrow.money.cash.loan.loanguide.activityMoney


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.databinding.MoneySplashBinding


class SplashMoney : AppCompatActivity() {
    private lateinit var binding: MoneySplashBinding

    var InProgress = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MoneySplashBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        Handler().postDelayed({ nextActivity() }, 2000)
    }

    private fun nextActivity() {
        InProgress = false
        startActivity(Intent(this, StartMoney_1::class.java))

    }

    override fun onRestart() {
        super.onRestart()
    }
}



