package mate.academy

const val ODD_MULTIPLIER = 2
const val EVEN_DIVISOR = 2
const val THRESHOLD = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
  return numbers
      .map { if (it % 2 == 0) it / EVEN_DIVISOR
      else it * ODD_MULTIPLIER}
      .filter {  it > THRESHOLD }
}
