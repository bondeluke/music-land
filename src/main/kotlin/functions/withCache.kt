package functions

fun <Input, Output> ((Input) -> Output).withCache(cache: MutableMap<Input, Output> = mutableMapOf()): (Input) -> Output {
    return { input -> cache[input] ?: this(input).also { cache[input] = it } }
}
