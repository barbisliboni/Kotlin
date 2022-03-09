package concepts.controls

fun main (args: Array<String>){
    val students = arrayListOf("Bárbara", "Thiago", "Meavy")

    for ((index, student) in students.withIndex()){
        println("${index + 1} = $student")
        /*
        1 = Bárbara
        2 = Thiago
        3 = Meavy
         */
    }
}