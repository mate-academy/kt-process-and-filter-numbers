package mate.academy

const val BOUNDARY = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers
        .map { if (it % 2 == 0) it / 2 else it * 2 }
        .filter { it > BOUNDARY }
}
