package concepts

fun main(args: Array <String>){
    val a: Int = 33.dec()
    var b: String = a.toString()

    print("Int: $a") //simple variable doesn't need to have keys
    println("First char from string b is: ${b.first()}") //dot operator needs to have keys
}