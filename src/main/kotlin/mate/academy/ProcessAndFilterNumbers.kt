package mate.academy

private const val MIN_RESULT_VALUE = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> = numbers.map { number ->
                if (number % 2 != 0) {
                    number * 2
                } else {
                    number / 2
                }
            }
            .filter { it > MIN_RESULT_VALUE }
