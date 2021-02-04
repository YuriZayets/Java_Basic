package kotlin_version.basics_of_software_code_development

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Exception
import java.math.BigInteger
import kotlin.math.*

fun main() {
}

fun taskOne(x: Int): Int {
    var sum = 0
    for (k in 1..x) sum += k
    return sum
}

fun taskTwo(a: Int, b: Int, h: Int) {
    for (i in a..b step h) {
        if (i > 2) {
            println("Корень: $i")
        } else println("Корень : -$i")
    }
}

fun taskThree() {
    var sum = 0
    for (i in 1..100) {
        sum += i
    }
    println(sum)
}

fun taskFour() {
    var sum: BigInteger = BigInteger.valueOf(1)
    for (i in 2..200) {
        sum = sum.multiply(BigInteger.valueOf(i * i.toLong()))
    }
    println(sum)
}

fun taskFive() {
    for (i in 0..255) {
        val ch = i.toChar()
        System.out.printf("Символ %c, его численное значение %d \n", ch, i)
    }
}

fun taskSix() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    println("Введите 2 числа по одному за раз")
    try {
        val answerOne = reader.readLine().toInt()
        val answerTwo = reader.readLine().toInt()
        for (i in min(answerOne, answerTwo)..max(answerOne, answerTwo)) {
            for (j in 2 until i) {
                if (i % j == 0) {
                    println("Найден делитель для $i, который равняется $j")
                }
            }
        }
    } catch (e: Exception) {
        println("Что-то пошло не так")
    }
}


fun taskSeven(a: Int, b: Int) {
    val digitsHolder = (a * 10.toDouble().pow(b.toString().length) + b).toInt()
    val digitsSet = HashSet<Char>()
    val chars = digitsHolder.toString().toCharArray()
    for (i in chars) digitsSet.add(i)

    for (x in digitsSet) {
        print("$x ")
    }
}