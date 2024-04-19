package mate.academy

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    val newList : MutableList<Int> = mutableListOf(0)
    for (num in numbers) {
        if (num % 2 == 0)
            newList.add(num/2)
        else
            newList.add(num * 2)
    }
    return newList.filter { it > 25 }.toList()
}
