package mate.academy

const val ZERO = 0
const val TWO = 2
const val MIN_VALUE = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    var numList : MutableList<Int> = mutableListOf()
    for (number in numbers) {
        var value = when {
            number % TWO == ZERO -> number / TWO
            else -> number * 2
        }
        if (value > MIN_VALUE) numList.add(value)
    }
    return numList
}
