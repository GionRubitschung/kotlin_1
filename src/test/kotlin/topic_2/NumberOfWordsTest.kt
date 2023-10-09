package topic_2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfWordsTest {
    @Test
    fun getNumberOfWords() {
        assertEquals(2, getNumOfWords("Hello World!"))
        assertEquals(2, getNumOfWords("    Hello8World!"))
        assertEquals(0, getNumOfWords(" "))
        assertEquals(0, getNumOfWords("678 0898 !32$"))
    }
}