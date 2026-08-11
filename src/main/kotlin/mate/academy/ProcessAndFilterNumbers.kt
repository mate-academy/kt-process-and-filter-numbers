package mate.academy

const val FILTER_VALUE = 25
fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    val processedAndFilteredNumbersList: MutableList<Int> = numbers.map {
        if (it % 2 != 0) it * 2
        else it / 2
    }.toMutableList()
    return processedAndFilteredNumbersList.filter { it > FILTER_VALUE }
}
