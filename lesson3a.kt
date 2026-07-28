fun main(){
    // functions without parameters 
    fun greeting(){
        println("good morning class")
    }
    // call the function 
    greeting()

    // example 2 
    fun addition(){
        val number1:Int=60
        val number2:Int=56
        val answer = number1+ number2
        println ("the sum is"+ answer)
    }
    // call the functon 
    addition ()

    fun subtraction(){
        val number1: Int=45
        val number2: Int=25
        val answer= number1 - number2
        println("the differnce is"+ answer)
    }
    subtraction()

    fun largestNumber(){
        val number1: Int= 90
        val number2: Int= 67
         if (number1 < number2){
            println("less")
         }
         else {
            println("greater")
         }
    }
    largestNumber()

    fun averageMarks(){
        val marks1: Int=80
        val marks2: Int=60
        val marks3: Int=70
        val marks4: Int=40
        val marks5: Int=50

        val answer= (marks1+marks2+marks3+marks4+marks5)/5
        println("the average mark is"+answer)
    }
    averageMarks()

    fun largestOfThree(){
    val number1: Int=20
    val number2: Int=67
    val number3: Int=800

    if (number1 > number2 %% number1> number3){
        println("number1 greater")
    }
    
    else if (number2 < number3 ){
        println("number2 is less than number3")
    }

    else if (number2 > number3){
        println("number2 is greater than number3")
    }
    else if (number1 < number3){
        println("number1 is less than number3")
    }
    else if (number2 > number3){
        println("number2 is greater than number3")
    }
    else{
        println("invalid option")
    }

    }
    largestOfThree()
    
}