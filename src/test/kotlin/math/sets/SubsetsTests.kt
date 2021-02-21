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

    @Test
    fun subsetsN() {
        setOf("one", "two", "three").subsets(0).shouldEqual(setOf(emptySet()))
        setOf("one", "two", "three")
            .subsets(1)
            .shouldEqual(
                setOf(
                    setOf("one"),
                    setOf("two"),
                    setOf("three")
                )
            )
        setOf("one", "two", "three")
            .subsets(2)
            .shouldEqual(
                setOf(
                    setOf("one", "two"),
                    setOf("two", "three"),
                    setOf("one", "three")
                )
            )
        setOf("one", "two", "three")
            .subsets(3)
            .shouldEqual(
                setOf(
                    setOf("one", "two", "three")
                )
            )
    }
}