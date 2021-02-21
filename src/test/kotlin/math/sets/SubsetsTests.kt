package math.sets

import org.junit.jupiter.api.Test
import testfunctions.shouldEqual

class SubsetsTests {
    @Test
    fun subsets() {
        setOf("one", "two")
            .subsets()
            .shouldEqual(
                setOf(
                    setOf(),
                    setOf("one"),
                    setOf("two"),
                    setOf("one", "two")
                )
            )
    }
}