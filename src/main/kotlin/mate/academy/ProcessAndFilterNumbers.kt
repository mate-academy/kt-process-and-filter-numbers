package mate.academy

fun processAndFilterNumbers(numbers: List<Int>) =
    numbers.map { if (it % TWO == ZERO) it / TWO else it * TWO }.filter { it > LIMIT }

const val ZERO = 0
const val TWO = 2
const val LIMIT = 25
