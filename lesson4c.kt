// parent/superclass
 open class Animal{
    fun hunt(){
    println("An animal can hunt")
 }
 fun eat(){
    println("An animal can eat")
 }
}


// child/subsclass
 class Dog : Animal(){
    // features 
    val name = "Rex"
    val age = 2
    //member functions of dog
    fun bite(){
        println("$name can bite")
    }
    fun run (){
        println("$name can run")
    }
}

// main function 
fun main(){
    // create a dog object
    val dogObject= Dog()
    // print dog name 
    println(dogObject.name)
    // print the dog age 
    println(dogObject.age)
    // print the member functions
    dogObject.bite()
    dogObject.run()
    dogObject.hunt()
    dogObject.eat()

}
