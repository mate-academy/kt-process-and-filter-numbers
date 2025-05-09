package mate.academy

const val THRESHOLD = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.map {
        if (it % 2 == 0 && it >= THRESHOLD) {
            it / 2
        } else if (it % 2 != 0) {
            it * 2
        } else {
            it
        }
    }.filter {
        it > THRESHOLD
    }
}
