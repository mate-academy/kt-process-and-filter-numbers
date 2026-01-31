package mate.academy

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    val processedAndFilteredNumbersList: MutableList<Int> = numbers.map {
        if (it % 2 != 0) it * 2
        else it / 2
    }.toMutableList()
    return processedAndFilteredNumbersList.filter { it > 25 }.toMutableList()
}
