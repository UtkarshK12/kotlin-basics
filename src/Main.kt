import collections.collectionsInit
import sealedClass.sealedInit

fun main() {
    val choice = readln().toInt()
    when(choice){
        1 -> sealedInit()
        2 -> collectionsInit()
    }
}