package mate.academy

private const val TWENTY_FIVE = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.asSequence()
        .map {if (it % 2 == 0) it /2 else it*2}
        .filter { it > TWENTY_FIVE }
        .toList()
}
