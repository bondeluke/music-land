package functions

import math.*


//     primes.take(5).toList().combinations()
fun List<Long>.combinations(): List<List<Long>> {
    for (i in 1 until 2.power(this.size)) {
        i.toString(2)
            .let { (this.size - it.length).repeat("0").join() + it }.reversed()
            .let { str ->
                var result = mutableListOf<Long>()
                str.forEachIndexed { i, c ->
                    if (c == '1')
                        result.add(primes[i])
                }
                result
            }
            .also {
                val p = it.product()
                val pp1 = p + 1

                if (pp1.primeIndex() > 0) {
                    "$pp1 = $p + 1 where p = x{ ${it.join(", ")} }, which is a prime.".print()
                } else {
                    "$pp1 = ${it.join(" x ")} + 1 = ${numbers[pp1]?.join(" x ")} | composite".print()
                }
            }
    }

    return emptyList()
}