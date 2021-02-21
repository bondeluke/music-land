package math

val ooo = mapOf("*" to Fraction::times, "+" to Fraction::plus)

class Expression {
    companion object {
        private fun evaluate(expression: String): Fraction {
            if (!expression.contains(" ")) return Fraction.fromString(expression)

            ooo.entries.reversed().forEach { operator ->
                val split = expression.split(operator.key, limit = 2).map { it.trim() }
                if (split.size == 2) {
                    return operator.value(evaluate(split[0]), evaluate(split[1]))
                }
            }

            error("The expression '${expression}' cannot be understood.")
        }

        fun evaluateToString(expression: String): String {
            return "$expression = ${evaluate(expression).reduce()}"
        }
    }
}