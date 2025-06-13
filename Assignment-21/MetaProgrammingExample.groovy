class DynamicPerson {
    String name
    Integer age
}

def person = new DynamicPerson(name: "Saravanan", age: 30)
println "Before: Name = ${person.name}, Age = ${person.age}"

person.metaClass.address = "Chennai"
person.metaClass.phone = "1234567890"

println "After: Name = ${person.name}, Age = ${person.age}, Address = ${person.address}, Phone = ${person.phone}"
