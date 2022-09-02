fun main() {
    var order: Int
    var isVip: Boolean

    order = 150
    isVip = false
    println("Вы сделали заказ на $order рублей.")
    println("С учетом Вашей скидки к оплате: ${payment(order, isVip)} рублей.")

    order = 1500
    isVip = true
    println("Вы сделали заказ на $order рублей.")
    println("С учетом Вашей скидки к оплате: ${payment(order, isVip)} рублей.")

    order = 10000
    isVip = false
    println("Вы сделали заказ на $order рублей.")
    println("С учетом Вашей скидки к оплате: ${payment(order, isVip)} рублей.")

    order = 11200
    isVip = true
    println("Вы сделали заказ на $order рублей.")
    println("С учетом Вашей скидки к оплате: ${payment(order, isVip)} рублей.")

}

// вычисляем сумму к оплате с учетом скидок
// "Меломаны" получают скидку 1% независимо от суммы заказа
fun payment(sum: Int, vip: Boolean): Double {
    var vipDiscount: Double = 1.0
    if (vip) vipDiscount = 0.99

    if (sum<=1000) return sum*vipDiscount
    else if (sum<=10000) {
        return (sum - 100)*vipDiscount
    }
    else return (sum*0.95)*vipDiscount
}