package com.borrow.money.cash.loan.loanguide

import android.content.Context
import android.net.ConnectivityManager
import android.os.Build
import android.os.StrictMode
import androidx.appcompat.app.AppCompatDelegate
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication


class MoneyApp : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        myApplication = this
        context = this

        MultiDex.install(this)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        (getSystemService(android.content.Context.CONNECTIVITY_SERVICE) as ConnectivityManager).getNetworkInfo(1)
        //   setupActivityListener()

        if (Build.VERSION.SDK_INT >= 26) {
            try {
                StrictMode::class.java.getMethod("disableDeathOnFileUriExposure", *arrayOfNulls(0))
                    .invoke(null as Any?, *arrayOfNulls(0))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    companion object {
        var context: Context? = null
            private set
        var myApplication: MoneyApp? = null
    }



}