package mate.academy

const val min = 25
fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    var nums = numbers.map {
        if (it % 2 == 0 ) it / 2 else it * 2
    }
    return nums.filter { it > min }
}
