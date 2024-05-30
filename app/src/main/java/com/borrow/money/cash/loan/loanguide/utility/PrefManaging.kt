package com.borrow.money.cash.loan.loanguide.utility

import android.content.SharedPreferences
import com.borrow.money.cash.loan.loanguide.MoneyApp.Companion.context


object PrefManaging {
    var editor: SharedPreferences.Editor? = null
    var sharedPreferences: SharedPreferences? = null
    fun init() {
        val sharedPreferences2 = context!!.getSharedPreferences("SharedPref", 0)
        sharedPreferences = sharedPreferences2
        editor = sharedPreferences2.edit()
    }

    private fun sharedPreferences(): SharedPreferences {
        return context!!.getSharedPreferences("PrefData", 0)
    }

    fun editor(str: String?, str2: String?) {
        editor!!.putString(str, str2)
        editor!!.apply()
    }

    fun editor(str: String?, i: Int) {
        editor!!.putInt(str, i)
        editor!!.apply()
    }

    @JvmStatic
    fun editor(str: String?, z: Boolean) {
        editor!!.putBoolean(str, z)
        editor!!.apply()
    }

    fun editor(str: String?, j: Long) {
        editor!!.putLong(str, j)
        editor!!.apply()
    }

    fun remove(str: String?) {
        editor!!.remove(str)
        editor!!.apply()
    }

    fun clear() {
        editor!!.clear()
        editor!!.apply()
    }

    val name: String?
        get() = sharedPreferences!!.getString("name", "")

    fun editorBoolean(str: String?, z: Boolean): SharedPreferences.Editor? {
        editor!!.putBoolean(str, z)
        editor!!.commit()
        return editor
    }

    val iSCountry: Boolean
        get() = sharedPreferences!!.getBoolean("isCountry", false)
    val iSCurrency: Boolean
        get() = sharedPreferences!!.getBoolean("isCurrency", false)

    @JvmStatic
    fun formatAmount(d: Double): String {
        return String.format("%.2f", java.lang.Double.valueOf(d))
    }

}