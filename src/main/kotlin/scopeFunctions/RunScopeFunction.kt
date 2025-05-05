package scopeFunctions

fun runScopeFunction(){

// RUN
// ------------------------
// - Object reference: "this" (implicit)
// - Return value: Lambda result
// - Best used for: When you want object methods/properties and need to return a result

// Example 1: Basic run usage
    val result = "Hello, World".run {
        // "this" refers to the string (can be omitted)
        println("The string is: $this")
        this.length // Returns length as the result of run
    }

    // Example 2: Run for object initialization and computation
    data class Person(var name: String, var age: Int, var city: String)

    val ageNextYear = Person("Alice", 25, "New York").run {
        // Initialize and perform computation in one go
        println("$name lives in $city")
        age + 1 // Returns the computed value
    }

// Example 3: Run as a non-extension function
    val output = run {
        // Run can also be used without an object
        val a = 10
        val b = 20
        a + b // Returns the result
    }
}