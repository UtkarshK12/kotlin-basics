package sealedClass

/* Basically we say this class is sealed so it means that it cannot be extended by any other class.
When we decompile the byte code for this class to create the java code,
we can see that the constructor for this class is private
Basically that means all the subclasses need to be defined here
*/

sealed class Shape(){

    abstract fun area():Float

    class Circle(val radius: Float): Shape(){
        override fun area(): Float = Math.PI.toFloat().times(radius).times(radius)
    }

    class Rectangle(val length: Float, val breadth: Float) : Shape(){
        override fun area(): Float = length.times(breadth)
    }

    class Square(val length: Float) : Shape(){
        override fun area(): Float = length.times(length)
    }

}

/* We can also use these similar to ENUMS along with when() to provide good functionalities
- example: For HTTP -> SUCCESS or ERROR */

fun printShape(shape: Shape){
    /*when is exhaustive for ENUMS and sealed classes. So we need to add a case for
    all the shapes. Cant only add for circle and omit rectangle and square
     */
    when(shape){
        is Shape.Circle -> println("its a circle")
        is Shape.Rectangle -> println("its a Rectangle")
        is Shape.Square -> println("its a Square")
    }
}
