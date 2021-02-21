package functions

inline fun <T, R> Iterable<T>.mapp(transform: (T) -> R): Map<T, R> {
    return this.map { it to transform(it) }.toMap()
}