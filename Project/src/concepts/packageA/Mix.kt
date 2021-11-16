package concepts.packageA

fun simpleFunction(text: String): String{
    return "Text = $text"
}

class Thing(val name: String)

enum class  CoinToss {HEAD, TAIL }