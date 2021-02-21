package math

import functions.repeat

fun Int.power(exponent: Int): Int {
    return this.repeat(exponent).reduce { product, number -> product * number }
}
