package mate.academy

// Define a constant for the threshold value
const val THRESHOLD = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers
        .map { number ->
            if (number % 2 == 0) {
                number / 2  // Halve if the number is even
            } else {
                number * 2  // Double if the number is odd
            }
        }
        .filter { it > THRESHOLD }  // Use the constant for the threshold
}
