class ClosureBasedCalculator {
    static def calculate(a, b, operation) {
        operation(a, b)
    }

    static void main(String[] args) {
        def add = { x, y -> x + y }
        def subtract = { x, y -> x - y }
        def multiply = { x, y -> x * y }

        println "Add: ${calculate(5, 3, add)}"
        println "Subtract: ${calculate(5, 3, subtract)}"
        println "Multiply: ${calculate(5, 3, multiply)}"
    }
}
