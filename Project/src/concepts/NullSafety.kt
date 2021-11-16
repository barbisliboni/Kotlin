package concepts

fun main(args: Array <String>){
    var a: Int? = null //use safe call operator (?) when using null values
    //can be used when the variable is optional (when it will or won't have a null value)
    //it only works on Kotlin, the same code wouldn't work on Java

    println(a?.dec())
}
