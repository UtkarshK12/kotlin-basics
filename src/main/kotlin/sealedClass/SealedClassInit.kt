package sealedClass

fun sealedInit() {
    val circle = Shape.Circle(7.toFloat())
    println(circle.area())

    printShape(circle)
}