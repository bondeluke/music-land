import functions.print
import math.sets.subsets

fun main() {
    (1..6).subsets()
        .groupBy { it.size }
        .map { it.print() }

}
