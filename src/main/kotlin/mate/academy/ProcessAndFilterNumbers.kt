package mate.academy

const val NUMBER_MORE = 25
const val DOUBLE_OR_MULTIPLY = 2
fun processAndFilterNumbers(numbers: List<Int>): List<Int> {

    val filteredList = numbers.map {
        val result = if (it % 2 == 0) {
            it / DOUBLE_OR_MULTIPLY
        } else {
            it * DOUBLE_OR_MULTIPLY
        }
        result
    }.filter { it > NUMBER_MORE }
        .toList()
    return (filteredList)
}


