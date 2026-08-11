package mate.academy

const val TWENTY_FIFE = 25
const val ZERO = 0
const val TWO = 2

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    val listOfResultIntegers = mutableListOf<Int>()

    for (number in numbers) {
        listOfResultIntegers.add(if (number % TWO == ZERO) number / TWO else number * TWO)
    }

    return listOfResultIntegers.filter { it > TWENTY_FIFE }
}
