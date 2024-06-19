package mate.academy

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    val two = 2
    val zero = 0
    val bounder = 25
    return numbers
        .map { if (it % two == zero) it / two else it * two }
        .filter { it > bounder }
}
