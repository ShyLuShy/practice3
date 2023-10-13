import kotlin.math.pow
import kotlin.random.Random

fun main(args: Array<String>) {

    // Задача 1
    val myAge = 18
    val isTeenager = 13 < myAge && myAge < 19

    // Задача 2
    val theirAge = 30
    val bothTeenager = (13 < myAge && myAge < 19) && (13 < theirAge && theirAge < 19)

    // Задача 3
    val reader = "Макс"
    val author = "Richard Lucas"
    val authorIsReader = reader == author

    // Задача 4
    val readerBeforeAuthor = reader > author

    // Задача 5
    val myAge2 = 18
    if (13 < myAge2 && myAge2 < 19) println("Подросток")
    else println("Не подросток")

    // Задача 6
    val answer = if (13 < myAge2 && myAge2 < 19) println("Подросток") else println("Не подросток")

    // Задача 7
    var counter = 0
    while(counter < 10){
        println(counter)
        counter++
    }

    // Задача 8
    counter = 0
    var roll = 0
    do{
        roll = Random.nextInt(6)
        counter++
        println("После $counter бросков, roll равен $roll")
    }while(roll != 0)

    // Задача 9
    val range = 1..10
    for (i in range){
        println("${i.toDouble().pow(2.0)}")
    }

    // Задача 10
    for (i in range) {
        println(Math.sqrt(i.toDouble()))
    }

    // Задача 11
    var sum = 0
    for (row in 1 until 8 step 2){
        for (column in 0 until 8){
            sum += row * column
        }
    }
    println(sum)

}