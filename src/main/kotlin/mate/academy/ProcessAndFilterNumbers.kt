package mate.academy
const val THRESHOLD = 25
const val EVEN_DIVIDER = 2
const val ODD_MULTIPLIER = 2

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers
        .map { if (it % 2 == 0) it / EVEN_DIVIDER else it * ODD_MULTIPLIER}
        .filter { it > THRESHOLD }
}
