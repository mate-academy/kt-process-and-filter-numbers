package mate.academy

private const val TWO = 2

private const val RANGE = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.map { if (it % TWO == 0) it / TWO else it * TWO }
        .filter { it > RANGE }
}
