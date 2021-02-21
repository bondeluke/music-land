package functions

fun <T, R> T.print(how: (T) -> R) {
    println(how(this).toString())
}

fun <T> T.print() {
    println(this.toString())
}