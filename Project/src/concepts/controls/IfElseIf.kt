package concepts.controls

fun main (args: Array<String>){
    val grade: Int = 9

    //using range operator
    if(grade in 8..10){
        println("Amazing!")
    }else if(grade in 7..8){
        println("Congrats!")
    }else if(grade in 4..6){
        println("There's still a chance...")
    }else if(grade in 0..3){
        println("See you next semester!")
    }else{
        println("Invalid grade!")
    }

    //it must always run from the lower value to the higher
    println(5 in 7..4)
    println(5 in 4..7)
}