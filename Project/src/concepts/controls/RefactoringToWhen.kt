package concepts.controls

fun main(args: Array<String>){
    val grade = 10

    //same as switch in java
    //less code and more specific
    when(grade){
        10, 9 -> print("Amazing") //same as 10 or 9
        8, 7 -> print("Congrats!")
        6, 5, 4 -> print("There's still a chance...")
        in 0..3 -> print("See you next semester!")
        else -> print("Invalid grade")
    }
}