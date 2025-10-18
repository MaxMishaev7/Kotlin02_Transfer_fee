package ru.netology

fun main() {
    // Задание 1. Денежные переводы
    val amount: Int = 10_000
    val fee_percent: Float = 0.75f
    val fee_min: Float = 35f
    val fee = (amount * fee_percent) / 100
    val transfer_fee = if (fee > fee_min) fee else fee_min
    print("Комиссия за перевод:\t$transfer_fee руб.")

    // Задание 2. Люди / Человеки

}