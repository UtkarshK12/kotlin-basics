package scopeFunctions

data class Employee (
    val name: String,
    var age: Int,
    val employeeId: Long,
    var position: Int?,
    var salary: Int?,
    var hobbies: List<String>?

)

// COMPARISON TABLE
// ------------------------
// | Function | Object Reference | Return Value      | Primary Use Case                      |
// |----------|------------------|-------------------|---------------------------------------|
// | let      | it (explicit)    | Lambda result     | Null safety, local variable scoping   |
// | run      | this (implicit)  | Lambda result     | Object operations with custom result  |
// | with     | this (implicit)  | Lambda result     | Grouping object operations            |
// | apply    | this (implicit)  | Receiver object   | Object configuration, builder pattern |
// | also     | it (explicit)    | Receiver object   | Side effects in method chains         |


fun scopeFunctionsInit() {
    val employee = Employee("John", 23, 12L, null,null,null)
    val employee2 = null

    //let function
    val letFunctionReturn = letFunction(employee)
    println(letFunctionReturn)

    //in let we need to write "it" all the places, so we have "with" scope function
    //With function
    val withFunctionReturn = withScopeFunction(employee)
    val withFunctionReturn2 = withScopeFunction(null)
    println(withFunctionReturn)
    println(withFunctionReturn2)


    //apply function
    val employeeConfig = applyScopeFunction(employee)
    println(employeeConfig)

    //also function
    alsoScopeFunction()

    //run function
    runScopeFunction()

}