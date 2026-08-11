package mate.academy

const val MIN_THRESHOLD = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    val mutableList = mutableListOf<Int>()
    for (number in numbers) {
        var double = 0
        if (number % 2 != 0) double = number * 2
        if (number % 2 == 0) double = number / 2
        if (double > MIN_THRESHOLD) mutableList.add(double)
    }
    return mutableList
}
