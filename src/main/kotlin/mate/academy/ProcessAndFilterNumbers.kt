package mate.academy

const val CN = 25
fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    val seen = mutableSetOf<Int>()
    numbers.forEach {
        if (it % 2 == 0) {
            if (it/2>CN)
            seen.add(it/2)
        } else {
            if (it*2>CN)
            seen.add(it*2)
        }
    }
    return seen.toList()
}
