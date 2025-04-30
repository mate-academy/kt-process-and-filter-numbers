package mate.academy

const val DEFAULT_GREATER_THEN_VALUE = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.asSequence()
        .map { if (it % 2 == 0) it / 2 else it * 2 }
        .filter { it > DEFAULT_GREATER_THEN_VALUE }
        .toList()
}
