package math

data class Fraction(val n: Int, val d: Int) {
    fun toFloat(): Float {
        return n.toFloat() / d.toFloat()
    }

    override fun toString(): String {
        return if (d == 1) n.toString() else "$n/$d"
    }

    companion object {
        fun fromString(fraction: String): Fraction {
            val parts = fraction.split("/").map { it.trim() }
            return if (parts.size == 2) {
                Fraction(parts[0].toInt(), parts[1].toInt()).reduce()
            } else Fraction(parts[0].toInt(), 1).reduce()
        }
    }
}

operator fun Fraction.plus(other: Fraction) =
    Fraction(n * other.d + other.n * d, d * other.d).reduce()

operator fun Fraction.times(other: Fraction) =
    Fraction(n * other.n, d * other.d).reduce()

fun Fraction.reduce(): Fraction {
    return gcd(n, d).let { Fraction(n / it, d / it) }
}