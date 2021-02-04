package kotlin_version.basics_of_software_code_development

import java.lang.Double.min

fun main() {
}

fun taskOne(a: Double, b: Double) {
    if (a > 0 && b > 0) {
        val c = 180 - (a + b)
        if (c > 0) {
            print("Треугольник существует")
            if (a == 90.0 || b == 90.0 || c == 90.0) {
                System.out.println(", он прямоугольный.")
            } else System.out.println(", он не прямоугольный.")
        } else println("Треуголбник не существует")
    }
}

fun taskTwo(a: Double, b: Double, c: Double, d: Double) = min(min(a, b), min(c, d))

fun taskThree(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Boolean =
        if ((x1.equals(x2)) && (x1.equals(x3)) || (y1.equals(y2)) && (y1.equals(y3))) {
            true
        } else {
            try {
                ((y3 - y1 * 1.0) / (y2 - y1 * 1.0)).equals((x3 - x1 * 1.0) / (x2 - x1 * 1.0))
            } catch (e: ArithmeticException) {
                false
            }
        }

fun taskFour(A: Double, B: Double, x: Double, y: Double, z: Double): Boolean {
    val hole = arrayListOf(A, B)
    hole.sort()
    val brick = arrayListOf(x, y, z)
    brick.sort()
    return hole[0] > brick[0] && hole[1] > brick[1]
}

fun taskFive(x: Double) =
        if (x <= 3) {
            x * x - 3 * x + 9
        } else 1 / (x * x * x + 6)
