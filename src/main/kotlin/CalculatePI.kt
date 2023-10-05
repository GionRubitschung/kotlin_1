import kotlin.math.floor
import kotlin.math.pow

fun truncate(n: Double, k: Int): Double {
    val c = (10.0).pow(k)
    return floor(n * c) / c
}

fun calculatePIGregory(steps: Int): Double {
    var pi = 0.0
    for (i in 0..<steps) {
        val digit = if (i % 2 == 0) 1.0 else -1.0
        pi += digit / ((2 * i) + 1)
    }
    return truncate(pi * 4, 3)
}

fun calculatePINilakantha(steps: Int): Double {
    var pi = 3.0
    for (i in 1..<steps) {
        val sign = if (i % 2 == 0) -1.0 else 1.0
        val k = i * 2.0
        pi += sign * (4 / (k * (k + 1) * (k + 2)))
    }
    return truncate(pi, 3)
}

fun main() {
    var piPrecision = false
    var i = 1
    var piGregory: Double
    do {
        piGregory = calculatePIGregory(i)
        if (piGregory == 3.141) piPrecision = true
        else i++
    } while (!piPrecision)
    println("Needed $i steps to calculate pi $piGregory with gregory for a precision of 3 digits")

    piPrecision = false
    i = 1
    var piNilakantha: Double
    do {
        piNilakantha = calculatePINilakantha(i)
        if (piNilakantha == 3.141) piPrecision = true
        else i++
    } while (!piPrecision)
    println("Needed $i steps to calculate pi $piNilakantha with gregory for a precision of 3 digits")
}