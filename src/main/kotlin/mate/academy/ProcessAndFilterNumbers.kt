package mate.academy

const val DIVIDER = 2
const val MIN_VALUE = 25
fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
   return numbers
            .map { if (it % DIVIDER == 0) it / DIVIDER else it * DIVIDER }
            .filter { it > MIN_VALUE }
}
