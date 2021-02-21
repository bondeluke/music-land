package math.sets

fun allBinarySequences(size: Int): List<List<Boolean>> {
    return if (size == 1) listOf(listOf(false), listOf(true))
    else allBinarySequences(size - 1).let { result ->
        result.map { listOf(false) + it } + result.map { listOf(true) + it }
    }
}