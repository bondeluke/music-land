package math

import kotlin.math.floor
import kotlin.math.sqrt

fun sqrtFloor(number: Int): Int {
    return floor(sqrt(number.toDouble())).toInt()
}