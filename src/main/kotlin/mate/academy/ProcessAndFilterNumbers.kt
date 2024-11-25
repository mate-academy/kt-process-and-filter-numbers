package mate.academy

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    val list = mutableListOf<Int>()
    for (i in numbers) {
        if (i % 2 == 0) {
            list.add(i / 2)
        } else {
            list.add(i * 2)
        }
    }
    return list.filter { it > 25 }
}
