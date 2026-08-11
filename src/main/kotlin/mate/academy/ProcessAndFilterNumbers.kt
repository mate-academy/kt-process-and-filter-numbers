package mate.academy

const val NUMBER = 2
const val BORDER = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers
        .map { number -> if (number  % NUMBER != 0) number * NUMBER else number / NUMBER}
        .filter { it > BORDER }
}
