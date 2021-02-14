package math

import kotlin.math.floor

fun sqrt(number: Long): Double {
    return kotlin.math.sqrt(number.toDouble())
}

fun sqrtFloor(number: Long): Long {
    return floor(sqrt(number)).toLong()
}