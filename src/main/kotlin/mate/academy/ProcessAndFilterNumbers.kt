package mate.academy

const val NUMBER = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    val res = mutableListOf<Int>()
    numbers.forEach {
        if (it % 2 != 0 && it * 2 > NUMBER)
            res.add(it * 2)
        else if (it % 2 == 0 && it / 2 > NUMBER)
            res.add(it / 2)
    }
    return res
}
