fun main() {
    var amount: Int = 100_000
    var comission = (amount * 75) / 10000
    comission = if (comission < 3500) 3500 else comission

    println("Комиссия за перевод $amount копеек составит $comission копеек")

    amount = 1_000_000
    comission = (amount * 75) / 10000
    comission = if (comission < 3500) 3500 else comission

    println("Комиссия за перевод $amount копеек составит $comission копеек")
}