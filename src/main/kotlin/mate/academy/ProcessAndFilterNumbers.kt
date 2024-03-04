package mate.academy

const val TWO_VALUE = 2
const val ZERO_VALUE = 0
const val FILTER_VALUE = 25

fun processAndFilterNumbers(numbers: List<Int>) = numbers
        .map { if (it % TWO_VALUE == ZERO_VALUE) it / TWO_VALUE else it * TWO_VALUE }
        .filter { it > FILTER_VALUE }
