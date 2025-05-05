package scopeFunctions

import java.io.File

fun alsoScopeFunction(){
// ALSO
// ------------------------
// - Object reference: "it" (can be renamed)
// - Return value: The object itself (receiver object)
// - Best used for: Actions that need the object reference and return the object (side effects)

// Example 1: Additional actions without affecting the chain
    val numbers = mutableListOf(1, 2, 3)
        .also { println("Original list: $it") } // Debugging
        .add(4) // Continue with the list operations

    // Example 2: Validation before returning
    data class User(val id: String, val name: String, val email: String)

    fun createUser(id: String, name: String, email: String): User {
        return User(id, name, email).also { user ->
            // Validate or log before returning the object
            require(user.email.contains("@")) { "Invalid email address" }
            println("Created user: ${user.name}")
        }
    }

    // Example 3: Method chaining with also
    val file = File("output.txt")
        .also { it.createNewFile() } // Create the file if it doesn't exist
        .also { println("File created at ${it.absolutePath}") } // Log the file path
        .writeText("Hello, Kotlin!") // Continue with file operations


}