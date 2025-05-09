package mate.academy

const val TWO: Int = 2
const val MIN_VALUE: Int = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.map { e -> if (e % TWO == 0) e / TWO else e * TWO }.filter { it > MIN_VALUE }
}
