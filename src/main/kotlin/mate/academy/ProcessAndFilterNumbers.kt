package mate.academy

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    val answer: MutableList<Int> = mutableListOf()
    var index = 0
    for (i in numbers.indices) {
        if (numbers[i] % 2 == 0 && (numbers[i] / 2) > 25) {
            answer.add(index++,numbers[i] / 2)
        }
        if (numbers[i] % 2 != 0 && (numbers[i] * 2) > 25) {
            answer.add(index++, numbers[i] * 2)
        }
    }
return answer
}
