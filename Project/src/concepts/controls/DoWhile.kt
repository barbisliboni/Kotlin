package concepts.controls

fun main (args: Array<String>){
    var option: Int = -1

    do{
        val line = readLine() ?: "0"
        option = line.toIntOrNull() ?: 0

        println("You chose the option $option")
    }while (option != -1)

    println("See you later!")
}