package mate.academy

const val DIVISOR = 2
const val MULTIPLIER = 2
const val FILTER_THRESHOLD = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.map { number ->
        if (number % DIVISOR == 0) {
            number / DIVISOR
        } else {
            number * MULTIPLIER
        }
    }.filter { it > FILTER_THRESHOLD }
}
