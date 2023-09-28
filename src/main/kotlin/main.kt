fun main(args: Array<String>) {
    val input = args.joinToString(separator = "")

    val words = getNumOfWords(input)
    println("\"$input\" contains $words words")

    val camelCase = convertToCamelCase(input)
    println("\"$input\" converted to camelcase: $camelCase")

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