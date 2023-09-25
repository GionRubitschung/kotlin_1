fun main(args: Array<String>) {
    val input = args.joinToString(separator = "")

    val words = getNumOfWords(input)
    println("\"$input\" contains $words words")

    val camelCase = convertToCamelCase(input)
    println("\"$input\" converted to camelcase: $camelCase")
}