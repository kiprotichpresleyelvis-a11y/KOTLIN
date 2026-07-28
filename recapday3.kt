fun main(){

fun evenOrOdd(number: Int){
    if (number % 2 ==0){
    println("number is even")
    }else{
    println("number is odd")
    }

}
evenOrOdd(4)

    fun trafficLights(light:String){
       
        if(light=="red"){
            println("STOP")
        }
         else if(light=="Amber"){
            println("GET READY")
        }
          else if(light=="green"){
            println("GO")
        }
        else{
            println("invalid option")
        }
    }
    trafficLights("Amber")
}