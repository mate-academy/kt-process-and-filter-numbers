package mate.academy

const val TWENTY_FIVE = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.map {
        n -> if (n % 2 == 0) n / 2 else n * 2
    }.filter { it > TWENTY_FIVE }
}
