package math

import functions.repeat

fun Long.power(exponent: Int): Long {
    return this.repeat(exponent).reduce { product, number -> product * number }
}
