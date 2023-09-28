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