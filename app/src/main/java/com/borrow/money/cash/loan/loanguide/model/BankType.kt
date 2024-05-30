package com.borrow.money.cash.loan.loanguide.model

class BankType {
    @JvmField
    var name: String? = null

    @JvmField
    var banknumber: String? = null

    @JvmField
    var bankmini: String? = null

    @JvmField
    var bankcare: String? = null

    constructor()
    constructor(name: String?, banknumber: String?, bankmini: String?, bankcare: String?) {
        this.name = name
        this.banknumber = banknumber
        this.bankmini = bankmini
        this.bankcare = bankcare
    }
}