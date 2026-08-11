package mate.academy

const val MAGIC = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers
        .map { i ->
            if (i % 2 == 0) i / 2 else i * 2
        }
        .filter { it > MAGIC }
        .toMutableList()
}
