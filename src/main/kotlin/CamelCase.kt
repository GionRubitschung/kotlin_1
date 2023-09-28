fun convertToCamelCase(string: String): String {
    val nonLettersPattern = "[^\\p{L}]+".toRegex()
    val cleanedUp = string.replace(nonLettersPattern, "")
    var camelCase = ""
    for (i in cleanedUp.indices) camelCase += if (i % 2 == 0) cleanedUp[i].uppercase() else cleanedUp[i].lowercase()
    return camelCase
}