package mate.academy

const val LOWER_BOUND = 25
fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers
        .map { if (it % 2 == 1) it * 2 else it / 2 }
        .filter { it > LOWER_BOUND }
}
