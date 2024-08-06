package mate.academy

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    var tem = mutableListOf<Int>()
    for (i in 0 until numbers.size) {
        if (numbers[i] % 2 == 1) {
            tem.add(numbers[i] * 2)
        } else {
            tem.add(numbers[i] / 2)
        }

    }
    var toList = tem.asSequence().filter { it > 25 }.toList()
    return toList
}
