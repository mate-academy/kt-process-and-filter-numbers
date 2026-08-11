package mate.academy

private const val ODD_CHECK_REMAINDER = 0
private const val EVEN_DIVISOR = 2
private const val ODD_MULTIPLIER = 2
private const val MIN_THRESHOLD = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> = numbers
    .map { if (it % EVEN_DIVISOR != ODD_CHECK_REMAINDER) it * ODD_MULTIPLIER else it / 2 }
    .filter { it > MIN_THRESHOLD }
