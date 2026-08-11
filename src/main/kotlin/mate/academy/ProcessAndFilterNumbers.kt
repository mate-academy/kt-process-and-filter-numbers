package mate.academy

const val FILTER = 25
fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers
        .map { e -> if (e % 2 == 0) e / 2 else e * 2 }
        .filter { it > FILTER }
}
