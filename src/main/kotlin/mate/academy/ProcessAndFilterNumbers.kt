package mate.academy
private const val DIVISOR_FOR_EVEN = 2
private const val MULTIPLEIRE_FOR_ODD = 2
private const val FILTER_THRESHOLD = 25
private const val PARTY_CHECKER = 0
//У вас є Listцілих чисел. Якщо число непарне, подвоїти його.
// Якщо число парне, зменшити вдвічі.
// Повернути підмножину колекції з числами більшими за 25
fun processAndFilterNumbers(numbers: List<Int>): List<Int> {

    val procedNumbers = numbers.map { n ->
        if (n % DIVISOR_FOR_EVEN != PARTY_CHECKER) {
            n * MULTIPLEIRE_FOR_ODD
        } else {
            n / DIVISOR_FOR_EVEN
        }
    }
    return procedNumbers.filter {n -> n > FILTER_THRESHOLD}
}
