fun main(){
    // functions with parameters 
    // these are functions that take input values 
    fun greeting(name : String){
        println("Goodmorning " + name)
    }
    // call the function 
    greeting("Elvis")
    greeting("Presley")

    // example2
    fun addition(number1 : Int , number2 : Int){
        val answer = number1 + number2
        println("the sum is" + answer)
    }
    // call the function
    addition(100,378)
    addition (800,900)


    // simple interest 
    fun simpleInterest (num1 : Int, num2 : Int,num3 : Int){
    val answer = (num1 * num2* num3) /100
    println ("the simple interest is"+ answer)
    }
    // call the function 
    simpleInterest(2000,12,4)



    // BODY MASS INDEX
    fun bmi(num1 : Int, num2 : Int){
    val answer = num1 / (num2 * num2)
    println ("the simple BMI is"+ answer)
    }
    // call the function 
    bmi(53,2)
}