class Person{
    //features
    val name = "Mary"
    val age = 18

    // member function 
    fun eat (){
        println("A person can eat")
    } 

     fun sleep(){
        println("A person can sleep")
    } 
}


fun main(){
    // create a person object
    val personObject = Person()
    // print name
    println(personObject.name)
    // print age 
    println(personObject.age)

    // print eat function 
    personObject.eat()
    // print sleep function 
    personObject.sleep()
}

