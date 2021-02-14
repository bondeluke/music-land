package math

fun Long.power(exponent: Int): Long {
    return (1..exponent).fold(this) { l, r -> l * r }
}

fun Int.power(exponent: Int): Int {
    return (1..exponent).fold(1) { l, _ -> this * l }
}

fun <T> Int.repeat(value: T): List<T> {
    return (1..this).map { value }
}