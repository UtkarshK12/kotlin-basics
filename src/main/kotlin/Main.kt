import collections.collectionsInit
import coroutines.coroutinesInit
import sealedClass.sealedInit

fun main() {
    println("enter choice")
    val choice = readln().toInt()
    when(choice){
        1 -> sealedInit()
        2 -> collectionsInit()
        3 -> coroutinesInit()
    }
}