package mate.academy

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.map { number ->
        if (number % 2 != 0) number * 2 else number / 2
    }
        .filter { it > 25 }
}
