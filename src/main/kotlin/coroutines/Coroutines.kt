package coroutines

import kotlinx.coroutines.*


/*coroutines are implemented on top of threads
lightweight compared to threads - less memory and faster context switching
mimic threads behavior*/

/*coroutines need 2 things - scope and context
scope - defines lifetime of coroutines
context - which threads the coroutines will launch on*/


/*dispatcher - way to define thread pool on which coroutines are executed
predefined dispatchers - IO, Main, Default
 */

/*Suspend - when we launch a function from a couroutine, we can mark it with a
suspend modifier and suspend the operation on particular points (yield, IO or API operations etc)
in this case, we will mark the function with suspend keyword
 */

fun runCoroutinesBasic(){

    /*
    According to the docs: You will often see runBlocking used like that
    at the very top-level of the application and quite rarely inside the real code,
    as threads are expensive resources and blocking them is inefficient and is often not desired.
     */

    /*
    An outer scope cannot complete until all its children coroutines complete.
    Structured concurrency also ensures that any errors in the code are
    properly reported and are never lost. In this example, the runBlocking establishes the scope
    */
    runBlocking {
        launch { task1() }
        launch { task2() }
    }
}
suspend fun task1() {
    println("starting task 1")
    yield()
    println("finished task 1")
}

suspend fun task2() {
    println("starting task 2")
    yield()
    println("finished task 2")
}