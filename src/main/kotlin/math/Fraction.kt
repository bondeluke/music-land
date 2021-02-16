package math

import java.lang.Integer.min


data class Fraction(val n: Long, val d: Long) {
    override fun toString(): String {
        return if (d == 1L) n.toString() else "$n/$d"
    }

    companion object {
        fun fromString(fraction: String): Fraction {
            val parts = fraction.split("/").map { it.trim() }
            return if (parts.size == 2) {
                Fraction(parts[0].toLong(), parts[1].toLong()).reduce()
            } else Fraction(parts[0].toLong(), 1)
        }
    }
}

operator fun Fraction.plus(other: Fraction) =
    Fraction(n * other.d + other.n * d, d * other.d).reduce()

operator fun Fraction.times(other: Fraction) =
    Fraction(n * other.n, d * other.d).reduce()

fun Fraction.reduce(): Fraction {
    val nf = factorize(n).groupBy { it }.map { it.key to it.value.size }.toMap()
    val df = factorize(d).groupBy { it }.map { it.key to it.value.size }.toMap()
    val commonFactor = nf.keys.intersect(df.keys).map { it.power(min(nf[it]!!, df[it]!!)) }.product()
    return Fraction(n / commonFactor, d / commonFactor)
}