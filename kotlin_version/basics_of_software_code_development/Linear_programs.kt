package kotlin_version.basics_of_software_code_development

import kotlin.math.*

fun main() {

}

fun taskOne(a: Double, b: Double, c: Double) = ((a - 3) * (b / 2)) + c

fun taskTwo(a: Double, b: Double, c: Double) = (b + sqrt(b * b + 4 * a * c)) / (2 * a) - a.pow(3) * c + b.pow(-2)

fun taskThree(x: Double, y: Double): Double {
    val a = Math.toRadians(x)
    val b = Math.toRadians(y)
    return ((sin(a) + cos(b)) / (cos(a) - sin(b))) * tan(a * b)
}

fun taskFour(T: Double): Double {
    val whole = T.toInt()
    val fraction = T - whole
    return round((fraction * 1000 + whole / 1000.0) * 1000) / 1000
}

fun taskFive(T: Int) {
    val hours = (T / 3600)
    val minutes = (T - hours * 3600) / 60
    val seconds = T - hours * 3600 - minutes * 60
    println("$hours ч $minutes мин $seconds с.")
}

fun taskSix(x: Double, y: Double) {
    if ((x >= -4 && x <= 4 && y >= -3 && y <= 0) || (x >= -2 && x <= 2 && y >= 0 && y <= 4)) {
        println("true")
    } else println("false")
}

