package math.sets

fun <T> Iterable<T>.subsets(): Set<Set<T>> {
    val set = this.toList()
    if (set.size > 16) error("Too many.")
    return allBinarySequences(set.size).map { binary ->
        (set.indices)
            .filter { index -> binary[index] }
            .map { index -> set[index] }
            .toSet()
    }.toSet()
}
