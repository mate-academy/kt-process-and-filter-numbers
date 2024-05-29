package mate.academy
const val NUM = 2;
fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    return numbers
        .map { if (it % NUM != 0) it * NUM else it / NUM}
        .filter { it > 25 }
}
