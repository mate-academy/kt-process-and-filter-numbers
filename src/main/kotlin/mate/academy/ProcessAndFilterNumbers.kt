package mate.academy

private const val AGE = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    val list = numbers.map {
        if (it % 2 == 0) it / 2 else it * 2
    }
    println(list)
    return list.filter { it > AGE }
}
