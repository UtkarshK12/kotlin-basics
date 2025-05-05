package collections

fun collectionsInit() {
    //Iterables -> Collections -> Lists
    //Iterables -> Collections -> Mutable Collections + Lists -> Mutable Lists

    // keep even mutable variables as val as the reference may change
    val list = listOf(1,2,4,4,5,6,7,null)
    //not possible -> list.add
    val mutableList = mutableListOf(1,2,3,4,5, null)
    // can't do this ->  mutableList = mutableList(2,3,4)

    //here we can do this
    var mutableList2 = mutableListOf(1,2,3,4,5)
    mutableList2 = mutableListOf(1,2,3)

    //filtering lists (or any other collections)
    //Basically transforming any collection returns a new collection (valid for mutable collections too)
    list.filterNotNull().filter { it -> it>2  }.forEach{println("number is $it")}

    //set prints distinct items
    val set = setOf(1,2,3,3)
    for (item in set) println(item)

    //normal map
    val map = mapOf( 1 to "key1",
        2 to "key2",
        3 to "key3")
    map.iterator().forEach { println("${it.key} ->  ${it.value}") }
}