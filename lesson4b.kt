class Square{
    //features/ properties
    val length = 5
    val width = 5
    // member functions 
    fun area (){
        val answer = length*width
        println("the area is" + answer)
    }

    fun perimeter(){
        val answer = 2*(length+width)
        println("the perimeter is"+ answer)
    }
}


fun main(){
   //  create a square object 
    val squareObject = Square()
    // print the length
    println(squareObject.length)
    // print the width
    println(squareObject.width)
    // print the area
    squareObject.area()
    // print the perimeter
    squareObject.perimeter()

}