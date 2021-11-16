package concepts

fun main (args: Array <String>){
    //int number type
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 9_223_372_036_854_775_807 //or Long.MAX_VALUE

    //float number type
    val num5: Float = 3.14F //needs to have the letter F
    val num6: Double = 3.14


    //char type
    val char: Char = '?'

    //boolean type
    val boolean: Boolean = true

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))

    println(2 is Int)
    println(21474835678 is Long)
    println(1.0 is Double)

    /*                         EVERYTHING IN KOTLIN IS AN OBJECT                     */
   //ex: println(10.dec())

}