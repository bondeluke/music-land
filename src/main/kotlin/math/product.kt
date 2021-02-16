package math

fun Iterable<Long>.product(): Long {
    return this.fold(1L) { l, r -> l * r }
}