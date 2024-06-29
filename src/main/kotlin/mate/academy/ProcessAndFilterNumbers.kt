package mate.academy

const val TWO = 2
const val MAX_VALUE = 25
fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.map { if (it % 2 == 0) it.div(TWO) else it.times(TWO)  }
        .filter { it > MAX_VALUE }
        .toList()
}
