def divide(a, b) {
    try {
        def result = a / b
        println "Result: $result"
    } catch (ArithmeticException e) {
        println "Error: Cannot divide by zero"
    } finally {
        println "Division completed\n"
    }
}

divide(10, 0)
divide(10, 2)

try {
    def file = new File("nonexistent.txt")
    def content = file.text
    println "File content: $content"
} catch (FileNotFoundException e) {
    println "Error: File not found"
} finally {
    println "File read attempt completed"
}
