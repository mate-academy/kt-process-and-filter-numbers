package mate.academy

const val TWO = 2
const val ZERO = 0
const val NUM = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.map { if (it % TWO == ZERO) it / TWO else it * TWO }.filter { it > NUM }
}
