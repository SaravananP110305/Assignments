class WordFrequencyCounter {
    static void main(String[] args) {
        print "Enter a sentence: "
        def input = System.console()?.readLine() ?: new Scanner(System.in).nextLine()
        def words = input.split("\\s+")
        def wordCount = [:].withDefault { 0 }

        words.each { word ->
            wordCount[word] += 1
        }

        wordCount.each { word, count ->
            println "$word → $count"
        }
    }
}
