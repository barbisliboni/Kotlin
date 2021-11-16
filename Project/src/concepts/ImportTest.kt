package concepts

import concepts.packageA.simpleFunction as normalFunction //importing a function and renaming
import concepts.packageA.Thing //importing a class
import concepts.packageA.CoinToss.HEAD //importing a particular val
import concepts.packageB.* //importing all

fun main(args: Array <String>){
    kotlin.io.println(normalFunction("Testing"))

    val thing = Thing("Ball")
    println(thing.name)

    println(HEAD)

    println("${sum(4,5)} ${subtraction(8, 10)}")
}