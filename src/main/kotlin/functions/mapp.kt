package functions

//inline fun <T, R> Iterable<T>.functions.mapp(transform: (T) -> Pair<T, R>): Map<T, R> {
//    return this.map(transform).toMap()
//}

// map.toMap() == mapMap == functions.mapp
inline fun <T, R> Iterable<T>.mapp(transform: (T) -> R): Map<T, R> {
    return this.map { it to transform(it) }.toMap()
}