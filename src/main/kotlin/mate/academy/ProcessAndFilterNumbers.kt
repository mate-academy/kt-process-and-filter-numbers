package mate.academy

private const val CHECK_VALUE = 25
private const val ODD_VALUE_CHECK = 2
private const val INCREMENT_VALUE = 2
private const val REM_VALUE = 1

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    val resultSet: MutableSet<Int> = mutableSetOf()
    numbers.forEach { num ->
        var value: Int = if (num % ODD_VALUE_CHECK == REM_VALUE) {
            num * INCREMENT_VALUE
        } else {
            num / INCREMENT_VALUE
        }
        if (value > CHECK_VALUE) {
            resultSet.add(value)
        }
    }
    return resultSet.toList()
}
