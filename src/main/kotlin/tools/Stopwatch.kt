package tools

import java.time.Instant

class Stopwatch {
    companion object {
        private fun snapshot() = Instant.now().toEpochMilli()

        fun time(block: () -> Unit) {
            snapshot().let { start ->
                block()
                (snapshot() - start)
                    .let { "elapsed: ${it}ms" }
                    .let(::println)
            }
        }
    }
}