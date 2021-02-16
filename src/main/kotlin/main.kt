import math.Expression

fun main() {
    Expression.evaluateAsString("4/5 * 7/2 + 3/2").also { println(it) }
    Expression.evaluateAsString("4/5").also { println(it) }
}
