package math.sets

import org.junit.jupiter.api.Test
import testfunctions.shouldEqual

class AllBinarySequencesTests {
    @Test
    fun allBinarySequences() {
        allBinarySequences(1).shouldEqual(
            listOf(
                listOf(true),
                listOf(false)
            )
        )
        allBinarySequences(2).shouldEqual(
            listOf(
                listOf(true, true),
                listOf(true, false),
                listOf(false, true),
                listOf(false, false)
            )
        )
        allBinarySequences(3).shouldEqual(
            listOf(
                listOf(true, true, true),
                listOf(true, true, false),
                listOf(true, false, true),
                listOf(true, false, false),
                listOf(false, true, true),
                listOf(false, true, false),
                listOf(false, false, true),
                listOf(false, false, false),
            )
        )
    }
}