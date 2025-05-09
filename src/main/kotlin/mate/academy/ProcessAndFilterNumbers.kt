package mate.academy

const val LIMITER = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    fun processor(number: Int): Int = when {
        number % 2 == 0 -> number / 2
        else -> number * 2
    }

    return numbers
        .map { processor(it) }
        .filter { it > LIMITER }
        .toList()
}
