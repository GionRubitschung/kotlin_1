import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TableExtractorTest {

    @Test
    fun extractFromTable() {
        val table1 = """
            |-----|----------|
            | Nb. | Quantity |
            |-----|----------|
            | 1   |    34    |
            | 2   |    128   |
            | 3   |    7     |
            | 4   |    5698  |
            | 5   |    29    |
            |-----|----------| 
        """

        val table2 = """
            |-----|----------|
            | Nb. | Quantity |
            |-----|----------|
            | 1   |    10    |
            | 2   |    200   |
            | 3   |    30     |
            |-----|----------| 
        """

        assertEquals(
            """
                    34
                   128
                     7
                  5698
                    29
            ==========
                  5896
        """.trimIndent(), extractFromTable(table1)
        )
        assertEquals(
            """
                    10
                   200
                    30
            ==========
                   240
        """.trimIndent(), extractFromTable(table2)
        )
    }
}