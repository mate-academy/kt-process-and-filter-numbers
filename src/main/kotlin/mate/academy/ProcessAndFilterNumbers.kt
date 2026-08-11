package mate.academy

const val TWENTY_FIVE = 25
fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers
        .map {num -> if (num % 2 == 0) num / 2 else num * 2 }
        .filter { it > TWENTY_FIVE}
}
