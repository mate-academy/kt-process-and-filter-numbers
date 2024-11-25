package mate.academy

const val MIN_NUM = 25
fun processAndFilterNumbers(numbers: List<Int>): List<Int> = numbers
    .map { if (it % 2 == 0) it / 2 else it * 2 }
    .filter { it > MIN_NUM }

