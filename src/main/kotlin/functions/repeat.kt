package functions

fun <T> T.repeat(howManyTimes: Int): List<T> {
    return (1..howManyTimes).map { this }
}