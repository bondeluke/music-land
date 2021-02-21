package functions

inline fun <T, K> Iterable<T>.groupBySortDesc(keySelector: (T) -> K): Map<K, List<T>> {
    return this.groupBy(keySelector)
        .toList()
        .sortedByDescending { it.second.size }
        .toMap()
}