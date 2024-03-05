package mate.academy

const val CONSTANT = 25
fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    val list: MutableList<Int> = mutableListOf()

    for (number in numbers) {
        if (number % 2 == 0 && number / 2 > CONSTANT) {
            list.add(number / 2)
        } else if (number % 2 != 0 && number * 2 > CONSTANT) {
            list.add(number * 2)
        }
    }

    return list
}
