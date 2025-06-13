class DynamicHandler {
    def propertyMissing(String name) {
        return "undefined"
    }
}

def obj = new DynamicHandler()
println obj.unknownProperty
println obj.someOtherProperty
