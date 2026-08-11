package mate.academy

const val THRESHOLD = 25
const val OPERATOR = 2

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.map { if (it % OPERATOR == 0) it / OPERATOR else it * OPERATOR }.filter { it > THRESHOLD }
}
