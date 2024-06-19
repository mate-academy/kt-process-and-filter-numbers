package mate.academy

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    val divider = 2
    val bounder = 25
    return numbers
        .map { if (it % divider == 0) it / divider else it * divider }
        .filter { it > bounder }
}
