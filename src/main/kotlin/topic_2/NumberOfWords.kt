package topic_2

fun getNumOfWords(sentence: String): Int {
    /**
     * `(\p{L}+)` captures one or more unicode letters and puts the match into a group --> matches a word in any language
     *
     * `|` the or operator, separates the word matcher with the separator matcher
     *
     * `[^\p{L}]+` captures all characters that are not unicode letters --> separators
     */
    val groupWordsPattern = "(?<word>\\p{L}+)|[^\\p{L}]+".toRegex()
    val words = groupWordsPattern.findAll(sentence)

    /**
     * Maps all group "word" matches to a list and returns the size
     */
    return words.map { it.groups["word"]?.value }.filterNotNull().toList().size
}

fun main(args: Array<String>) {
    val input = args.joinToString(separator = " ")

    val words = getNumOfWords(input)
    println("\"$input\" contains $words words")
}