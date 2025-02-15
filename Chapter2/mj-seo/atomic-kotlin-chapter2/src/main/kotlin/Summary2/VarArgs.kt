package summary2

import atomictest.trace


fun varargs(s: String, vararg ints: Int) {
    for (i in ints) {
        trace("$i")
    }
    trace(s)
}

fun main() {
    varargs("primes", 5, 7, 11, 13, 17, 19, 23)
    trace eq "5 7 11 13 17 19 23 primes"
}