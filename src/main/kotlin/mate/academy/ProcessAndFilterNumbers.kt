package mate.academy

const val VALID_NUMBER = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.map {n -> if (n % 2 == 0 ) n / 2 else n * 2 }
        .filter { it > VALID_NUMBER }
}
