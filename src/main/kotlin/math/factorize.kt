package math

private fun factorizeCore(number: Int): List<Int> {
    if (number == 1) return emptyList()

    val sqrt = sqrtFloor(number)
    for (prime in primes.asSequence().filter { it <= sqrt }) {
        if (prime.divides(number))
            return listOf(prime).plus(factorize(number / prime))
    }

    return listOf(number)
}

// Cache is muscle memory, musically speaking... i.e. no thinking ;)
// Using the brain analogy, cache should expire after some amount of time... or take Inter to look up.
val numbers = mutableMapOf<Int, List<Int>>()
val primes = mutableListOf<Int>()
val composites = mutableMapOf<Int, List<Int>>()
var largestNumberFactorized = 0

private fun Int.saveFactors(factors: List<Int>) {
    numbers[this] = factors

    if (factors.size == 1) {
        primes.add(this)
    } else {
        composites[this]
    }
}

fun factorize(number: Int): List<Int> {
    if (number > largestNumberFactorized) factorizeUpTo(number)
    return numbers[number] ?: factorizeCore(number).also { number.saveFactors(it) }
}

private fun factorizeUpTo(number: Int) {
    largestNumberFactorized = number
    (1..number).forEach { factorize(it) }
}

fun Int.isPrime(): Boolean{
    return primes.contains(this)
}