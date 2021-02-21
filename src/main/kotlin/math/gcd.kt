package math

fun gcd(a: Int, b: Int): Int {
    return a.mod(b).let {
        if (it == 0) b
        else gcd(b, it)
    }
}