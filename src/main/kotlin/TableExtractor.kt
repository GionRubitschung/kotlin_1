fun extractFromTable(table: String): String {
    val quantityExtractorPattern = "\\|\\s*\\d*\\s*\\|\\s*(?<quantity>\\d*)\\s*\\|\\n".toRegex(RegexOption.MULTILINE)
    val quantities = quantityExtractorPattern.findAll(table).map {
        val (quantity) = it.destructured
        quantity
    }.toList()

    val separator = "=========="
    return quantities.plus(separator).plus(quantities.sumOf { it.toInt() }.toString())
        .joinToString("\n") { it.padStart(separator.length) }
}

fun main() {
    val table = """
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
    println(extractFromTable(table))
}