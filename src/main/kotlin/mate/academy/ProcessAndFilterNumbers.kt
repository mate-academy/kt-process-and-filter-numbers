package mate.academy
//You have a `List` of integers. If a number is odd, double it. If a number is even, half it. Return a subset of the collection with numbers greater than `25`.

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    val resultSet: MutableSet<Int> = mutableSetOf()
    numbers.forEach { num ->
        var value: Int = if (num % 2 == 1) {
            num * 2
        } else {
            num / 2
        }
        if (value > 25) {
            resultSet.add(value)
        }
    }
    return resultSet.toList()
}
