package mate.academy

const val FILTER_VALUE = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.map { number ->
        if (number % 2 != 0) number * 2 else number / 2
    }
        .filter { it > FILTER_VALUE}
}
