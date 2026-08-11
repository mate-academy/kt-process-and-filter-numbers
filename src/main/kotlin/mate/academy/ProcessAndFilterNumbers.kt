package mate.academy

const val DOUBLE = 2
const val MORE_THAN_NUMBER = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.map {
        if (it % 2 != 0) {
            it * DOUBLE
        } else {
            it / DOUBLE
        }
    }.filter {it > MORE_THAN_NUMBER}
}
