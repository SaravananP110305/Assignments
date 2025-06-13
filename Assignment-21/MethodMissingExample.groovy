class DynamicHandler {
    def methodMissing(String name, args) {
        println "Method ${name} is not defined"
    }
}

def obj = new DynamicHandler()
obj.undefinedMethod(1, 2)
obj.someRandomCall()
