package math.sets

import org.junit.jupiter.api.Test
import testfunctions.shouldEqual

class SubsetsTests {
    @Test
    fun subsets() {
        mapOf(
            1 to "[[1], []]",
            2 to "[[1, 2], [1], [2], []]",
            3 to "[[1, 2, 3], [1, 2], [1, 3], [1], [2, 3], [2], [3], []]",
            4 to "[[1, 2, 3, 4], [1, 2, 3], [1, 2, 4], [1, 2], [1, 3, 4], [1, 3], [1, 4], [1], [2, 3, 4], [2, 3], [2, 4], [2], [3, 4], [3], [4], []]"
        ).forEach {
            (1..it.key).subsets().toString().shouldEqual(it.value)
        }
    }

    @Test
    fun subsetsN() {
        mapOf(
            0 to "[[]]",
            1 to "[[1], [2], [3], [4], [5]]",
            2 to "[[1, 2], [1, 3], [1, 4], [1, 5], [2, 3], [2, 4], [2, 5], [3, 4], [3, 5], [4, 5]]",
            3 to "[[1, 2, 3], [1, 2, 4], [1, 2, 5], [1, 3, 4], [1, 3, 5], [1, 4, 5], [2, 3, 4], [2, 3, 5], [2, 4, 5], [3, 4, 5]]",
            4 to "[[1, 2, 3, 4], [1, 2, 3, 5], [1, 2, 4, 5], [1, 3, 4, 5], [2, 3, 4, 5]]",
            5 to "[[1, 2, 3, 4, 5]]"
        ).forEach {
            (1..5).subsets(it.key).toString().shouldEqual(it.value)
        }
    }
}