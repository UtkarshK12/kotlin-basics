package scopeFunctions

fun withScopeFunction(employee: Employee?):String{
// Use WITH when:
// - Operating on a non-nullable object multiple times
// - Not concerned about the return value being the object itself
// - Want to avoid repeating the object name in multiple operations
// - Prefer using 'this' over 'it'

    return with(employee){
        "Hello ${this?.name?:"Future joiner"}"
    }
}