package mate.academy
const val ZERO = 0
const val TWO = 2
const val FILTER_BY = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.map { if (it % TWO == ZERO) it / TWO else it * TWO}
        .filter { it > FILTER_BY }
        .toList()
}
