package math

import org.junit.jupiter.api.Test
import testfunctions.shouldEqual

class GcdTests {
    @Test
    fun gcd() {
        listOf(
            listOf(1, 1, 1),
            listOf(1, 2, 1),
            listOf(2, 27, 1),
            listOf(3, 27, 3),
            listOf(4, 6, 2),
            listOf(3, 6, 3),
            listOf(6, 15, 3),
            listOf(6, 30, 6),
            listOf(24, 36, 12)
        ).forEach {
            gcd(it[0], it[1]).shouldEqual(it[2])
            gcd(it[1], it[0]).shouldEqual(it[2])
        }
    }
}
