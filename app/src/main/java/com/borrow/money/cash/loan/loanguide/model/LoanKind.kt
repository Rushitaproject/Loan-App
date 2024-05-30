package com.borrow.money.cash.loan.loanguide.model

class LoanKind {
    @JvmField
    var name: String? = null

    constructor()
    constructor(name: String?) {
        this.name = name
    }
}