import functions.print
import math.sets.subsets

fun main() {
    (0..4).subsets()
        .groupBy { it.size }
        .map { it.print() }

    (0..4).subsets(5).print()
}

