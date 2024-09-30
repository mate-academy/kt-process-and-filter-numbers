package mate.academy

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers.map { if (it % 2 == 0) it / 2 else it * 2 }.filter { it > 25 }

//    val mutableList = mutableListOf<Int>()
//    for (number in numbers) {
//        if (number % 2 == 0) {
//            mutableList.add(number / 2)
//        } else {
//            mutableList.add(number * 2)
//        }
//    }
//    return mutableList.filter { it > 25 }
}
