package mate.academy

const val DIVIDER = 2
const val RESULT_OF_DIVIDING = 0
const val CONDITION_NUMBER = 25
fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.map { if (it % DIVIDER == RESULT_OF_DIVIDING) it / DIVIDER else it * DIVIDER }
        .filter { it > CONDITION_NUMBER }
}
