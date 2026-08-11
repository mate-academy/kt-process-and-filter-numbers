package mate.academy

private const val MIN_VALUE = 25
fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
   return numbers.map { when {
        it % 2 == 0 -> it / 2
        it % 2 == 1 -> it * 2
        else -> {0}
    } }.filter { it > MIN_VALUE }
}
