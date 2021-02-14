package math

fun Long.divides(number: Long): Boolean {
    return number % this == 0L
}
