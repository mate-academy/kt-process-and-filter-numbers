package mate.academy

const val TWO = 2
const val TWENTY_FIVE = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.map { if (it % TWO == 0) it / TWO else it * TWO }.filter { it > TWENTY_FIVE }
}
