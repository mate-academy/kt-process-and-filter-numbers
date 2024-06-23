package mate.academy

const val FILTER_VALUE = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    val myList: MutableList<Int> = MutableList<Int>(numbers.size) { 0 }
    numbers.forEachIndexed { index, num ->
        if (num % 2 == 0) {
            myList.set(index, num.div(2))
        } else {
            num.times(2)
            myList.set(index, num.times(2))
        }
    }
    return myList.filter { num -> num > FILTER_VALUE }
}

