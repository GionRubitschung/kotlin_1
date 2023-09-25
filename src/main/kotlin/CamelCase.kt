fun convertToCamelCase(string: String): String {
    val pattern = "\\p{L}".toRegex()
    val camelCase = string.replace(pattern) {
        if (it.range.first % 2 == 0) it.value.uppercase()
        else it.value.lowercase()
    }
    return camelCase
}