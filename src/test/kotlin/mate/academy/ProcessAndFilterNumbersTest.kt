package mate.academy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ProcessAndFilterNumbersTest {

    @Test
    fun processAndFilterNumbers_MixedNumbers_ReturnsFilteredSubset() {
        // given
        val numbers = listOf(12, 25, 30, 8, 32, 3, 11)

        // when
        val result = processAndFilterNumbers(numbers)

        // then
        assertEquals(listOf(50), result)
    }

    @Test
    fun processAndFilterNumbers_AllNumbersLessThan25_ReturnsEmptyList() {
        // given
        val numbers = listOf(2, 4, 6, 8, 10)

        // when
        val result = processAndFilterNumbers(numbers)

        // then
        assertEquals(emptyList<Int>(), result)
    }

    @Test
    fun processAndFilterNumbers_AllOddNumbers_ReturnsDoubledFilteredSubset() {
        // given
        val numbers = listOf(13, 15, 17)

        // when
        val result = processAndFilterNumbers(numbers)

        // then
        assertEquals(listOf(26, 30, 34), result)
    }

    @Test
    fun processAndFilterNumbers_AllEvenNumbers_ReturnsHalvedSubset() {
        // given
        val numbers = listOf(50, 60, 70)

        // when
        val result = processAndFilterNumbers(numbers)

        // then
        assertEquals(listOf(30, 35), result.filter { it > 25 })
    }

    @Test
    fun processAndFilterNumbers_EmptyList_ReturnsEmptyList() {
        // given
        val numbers = emptyList<Int>()

        // when
        val result = processAndFilterNumbers(numbers)

        // then
        assertEquals(emptyList<Int>(), result)
    }
}
