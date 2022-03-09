package concepts.controls

//it's not possible to do it in Java, only in Kotlin

fun main (args: Array<String>){
    //using if else as an expression
    //it can substitute ternary operator

    val number1: Int = 1
    val number2: Int = 2

    val higherValue = if (number1 > number2){
        println("Processing if...")
        number1//the last if line will be the expression return
    }else{
        println("Processing else...")
        number2
    }

    /*
     it could also be like this:
     val higherValue = if (number1 > number2) number1 else number2
     */

    println("The higher value is $higherValue")
}