fun main(){
    val points =-566
    if (points >=0 && points <= 100){
        println("To WIN A PHONE")
    } 
    else if(points >100  && points <=300){
        println("To WIN A LAPTOP")
    } 
    else if (points >300 && points <= 1000){
        println("To WIN A CAR")
    } 
    else if (points >=1000){
        println("TRIP TO US")
    }
    else{
        println("INVALID OPTION")
    }
}