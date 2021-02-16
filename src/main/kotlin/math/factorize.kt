package math

private fun factorizeCore(number: Long): List<Long> {
    if (number == 1L) return emptyList()

    val sqrt = sqrtFloor(number)
    for (prime in primes.asSequence().filter { it <= sqrt }) {
        if (prime.divides(number))
            return listOf(prime).plus(factorize(number / prime))
    }

    return listOf(number)
}

// Cache is muscle memory, musically speaking... i.e. no thinking ;)
// Using the brain analogy, cache should expire after some amount of time... or take longer to look up.
val numbers = mutableMapOf<Long, List<Long>>()
val primes = mutableListOf<Long>()
val composites = mutableMapOf<Long, List<Long>>()
var largestNumberFactorized = 0L

private fun Long.saveFactors(factors: List<Long>) {
    numbers[this] = factors

    if (factors.size == 1) {
        primes.add(this)
    } else {
        composites[this]
    }
}

fun factorize(number: Long): List<Long> {
    if (number > largestNumberFactorized) factorizeUpTo(number)
    return numbers[number] ?: factorizeCore(number).also { number.saveFactors(it) }
}

private fun factorizeUpTo(number: Long) {
    largestNumberFactorized = number
    (1..number).forEach { factorize(it) }
}
