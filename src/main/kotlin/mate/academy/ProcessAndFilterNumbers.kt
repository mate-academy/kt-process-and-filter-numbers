package mate.academy

private const val MORE_THEN_VALUE = 25

private const val TWO = 2

private const val ZERO = 0

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.toMutableList()
        .map {if (it % TWO == ZERO) it / TWO else it * TWO }
        .filter{it > MORE_THEN_VALUE }
}
