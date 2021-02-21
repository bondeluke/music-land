package testfunctions

fun <T> T.shouldEqual(expectation: T) {
    if (this != expectation) error("Expected: $expectation, Actual: $this")
}