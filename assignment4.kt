class Circle{
    // property
    val radius = 14
    // member function
    fun area(){
        val answer = 22/7 * (radius*radius)
        println("the area is"+answer)
    }

    fun diameter(){
        val answer = radius+radius
        println("the diameter is"+answer)
    }
}

fun main(){
    // create a circle function 
    val circleObject = Circle()
    // print the radius 
    println(circleObject.radius)
    // print the area 
    circleObject.area()
    // print the diameter 
    circleObject.diameter()
    
}