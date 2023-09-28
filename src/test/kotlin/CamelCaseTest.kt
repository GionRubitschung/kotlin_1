import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CamelCaseTest {

    @Test
    fun convertToCamelCase() {
        assertEquals("ThIsIsAsEnTeNcE", convertToCamelCase("This is a sentence"))
        assertEquals("ThIsIsAsEnTeNcEwItHaNäÖ", convertToCamelCase("     This is a!sent\$ence!    with_an[äö"))
    }
}