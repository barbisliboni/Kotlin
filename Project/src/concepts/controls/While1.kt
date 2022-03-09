package concepts.controls

fun main(args: Array<String>){
    var option: Int = 0

    while(option != -1){
        val line = readLine() ?: "0" //reading a console input
        option = line.toIntOrNull() ?: 0

        println("You chose the option $option")
    }
    println("See you later!")
}