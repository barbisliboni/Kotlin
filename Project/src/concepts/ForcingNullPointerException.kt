package concepts

fun main (args: Array <String>){
    var a: Int? = null

    println(a?.inc())
    println("Error moment...")
    println(a!!.inc()) //error here cause the variable is null

}