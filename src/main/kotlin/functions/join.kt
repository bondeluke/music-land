package functions

fun <T> Iterable<T>.join(delimiter: String = ""): String {
    return this.joinToString(delimiter)
}