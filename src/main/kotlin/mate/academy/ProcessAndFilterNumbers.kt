package mate.academy

const val FILTER_THRESHOLD = 25

fun processAndFilterNumbers(numbers: List<Int>): IntArray {
    val list = mutableListOf<Int>()
    for (i in numbers) {
        if (i % 2 == 0) {
            list.add(i / 2)
        } else {
            list.add(i * 2)
        }
    }
    return list.filter { it > FILTER_THRESHOLD }.toIntArray()
}
