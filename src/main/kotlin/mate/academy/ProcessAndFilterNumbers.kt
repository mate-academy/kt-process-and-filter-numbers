package mate.academy

const val VALUE_LIMIT = 25
fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.map {
        if (it.rem(2) != 0) it.times(2) else it.div(2)
    }.filter { it > VALUE_LIMIT }
}
