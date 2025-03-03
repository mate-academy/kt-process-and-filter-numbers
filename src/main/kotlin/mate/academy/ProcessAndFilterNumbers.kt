package mate.academy

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers
        .map { e -> if (e % 2 == 0) e / 2 else e * 2 }
        .filter { it > 25 }
}
