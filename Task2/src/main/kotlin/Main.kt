fun main() {
    var likes: Int

    likes = 1
    println("Понравилось $likes ${howProperly(likes)}")

    likes = 10
    println("Понравилось $likes ${howProperly(likes)}")

    likes = 32
    println("Понравилось $likes ${howProperly(likes)}")

    likes = 111
    println("Понравилось $likes ${howProperly(likes)}")

    likes = 321
    println("Понравилось $likes ${howProperly(likes)}")
}

// возвращаем правильное написание в зависимости от полученного числа
fun howProperly(number: Int): String {
    if ( ( (number % 10) === 1) && ((number % 100) != 11) ) return "человеку"
    else return "людям"
}