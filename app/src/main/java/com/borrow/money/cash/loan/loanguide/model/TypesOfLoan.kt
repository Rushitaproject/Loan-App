package com.borrow.money.cash.loan.loanguide.model

class TypesOfLoan {
    @JvmField
    var image = 0
    @JvmField
    var name: String? = null

    constructor(image: Int, name: String?) {
        this.image = image
        this.name = name
    }
}