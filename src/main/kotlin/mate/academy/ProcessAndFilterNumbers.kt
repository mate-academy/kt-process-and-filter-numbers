package mate.academy

const val THRESHOLD = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    val tem = mutableListOf<Int>()
    for (i in 0 until numbers.size) {
        if (numbers[i] % 2 == 1) {
            tem.add(numbers[i] * 2)
        } else {
            tem.add(numbers[i] / 2)
        }
    }

    val toList = tem.asSequence().filter { it > THRESHOLD }.toList()
    return toList
}
