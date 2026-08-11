package mate.academy

private const val TWO: Int = 2;
private const val TWENTY_FIVE: Int = 25;

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers
        .map { if (it % 2 == 0) it / TWO else it * TWO }
        .filter { it > TWENTY_FIVE }
        .toList()
}
