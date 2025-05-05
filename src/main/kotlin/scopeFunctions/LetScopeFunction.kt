package scopeFunctions

fun letFunction(employee: Employee?): String{
// Use LET when:
// - Working with nullable values
// - Need to introduce a scoped variable with a custom name
// - Don't want to modify the original object
// - Need to transform the object into something else

    return employee?.let {
        "Hello ${it.name}"
    }?:"Hello future joiner"

}