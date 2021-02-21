package math.sets

import org.junit.jupiter.api.Test
import testfunctions.shouldEqual

class AllBinarySequencesTests {
    @Test
    fun allBinarySequences() {
        allBinarySequences(1).shouldEqual(
            listOf(
                listOf(false),
                listOf(true)
            )
        )
        allBinarySequences(2).shouldEqual(
            listOf(
                listOf(false, false),
                listOf(false, true),
                listOf(true, false),
                listOf(true, true)
            )
        )
        allBinarySequences(3).shouldEqual(
            listOf(
                listOf(false, false, false),
                listOf(false, false, true),
                listOf(false, true, false),
                listOf(false, true, true),
                listOf(true, false, false),
                listOf(true, false, true),
                listOf(true, true, false),
                listOf(true, true, true),
            )
        )
    }
}