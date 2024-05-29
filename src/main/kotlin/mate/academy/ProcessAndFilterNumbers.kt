package mate.academy
const val NUM = 2;
const val RANGE = 25;
fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers
        .map { if (it % NUM != 0) it * NUM else it / NUM}
        .filter { it > RANGE }
}
