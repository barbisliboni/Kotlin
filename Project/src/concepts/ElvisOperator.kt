package concepts

fun main (args: Array <String>){
    val optional: String? = null //if there is a value here, the printed value will be the one wrote on optional variable
    //else, it will print "default value"

    //val obligatory: String = optional //will fail
    val obligatory: String = optional ?: "default value"

    println(obligatory)
}