package math

fun Iterable<Long>.product(): Long {
    return this.reduce { l, r -> l * r }
}