package mate.academy

const val NUM: Int = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.map { number -> if (number % 2 != 0) number * 2 else number / 2}
                .filter { it > NUM }
                .toList()
}
