package functions

fun <T, R> Iterable<T>.cross(other: Iterable<T>, func: (List<T>) -> R): List<R> {
    return this.flatMap { o -> other.map { t -> func(listOf(o, t)) } }
}