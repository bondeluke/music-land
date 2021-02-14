package math

fun Long.primeIndex(): Int {
    return primes.indexOf(this)
}