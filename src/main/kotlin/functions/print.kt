package functions

fun <T> T.print(): T {
    println(this.toString())
    return this
}