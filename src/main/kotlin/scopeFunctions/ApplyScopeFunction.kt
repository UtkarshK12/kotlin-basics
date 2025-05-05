package scopeFunctions

fun applyScopeFunction(employee: Employee):Employee{
// Use APPLY when:
// - Configuring/initializing an object
// - Need the same object returned after configuration
// - Using a builder-like pattern
// - Chaining configuration operations

   return employee.apply {
        employee.salary = 5000
        employee.hobbies = listOf("Sports")
        employee.position = 2
    }
}