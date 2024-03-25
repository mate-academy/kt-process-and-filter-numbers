package mate.academy

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    val filteredList = numbers.map {
        val result = if (it % 2 == 0) {
            it / 2
        } else {
            it * 2
        }
        result
    }.filter { it > 25 }
        .toList()
    return (filteredList)
}
