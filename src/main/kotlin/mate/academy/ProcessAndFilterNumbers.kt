package mate.academy
const val NUMBER_TWO = 2
const val NUMBER_THAN = 25
const val ZERO = 0

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {

    val listAfter = mutableListOf<Int>()

    for (i in numbers.indices) {
        if (numbers[i] % NUMBER_TWO == ZERO) {
            listAfter.add(numbers[i] / NUMBER_TWO)
        } else {
            listAfter.add(numbers[i] * NUMBER_TWO)
        }
    }
    println(listAfter)
    return listAfter.filter { it > NUMBER_THAN }.toList()
}
