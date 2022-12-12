fun main() {
    /*Example#01 - Converter number
    doubleToInt()
     */
    /*Example#02 - concat a function wiht a String
    val price = 20.2
    val price2 = 2.2
    println("a soma = ${sum(price, price2)}")
     */
    /*Example#03 - Clausula When
    conditionWhen()
     */
    /*Example#04 -  Check null available
    checkForNull()
     */
    /*Example#05 -  Pair and Tiple
    pairAndTiple()
     */
    /*Example#06 -  Assigning parameter in function attribute*/
    println("a soma = ${sum(2.0)}")


}

fun pairAndTiple() {
    /*Example#01 - Pair using first e second
    val coord = Pair(2, 5)
    println("x = ${coord.first} y = ${coord.second}")
    */
    /*Example#02 - Pair using destrutor
    val coord = Pair(2, 5)
    val (x, _) = coord
    println("x: $x")
    */
    /*Example#03 - Triplo */
    val coord = Triple(2, 5, 10)
    val (x, y, z) = coord
    println("x: $x | y = $y | z = $z")

}

fun checkForNull() {
    var msg: String? = "texto"
//msg = null
    /*Option#01 - Using the if
    if (msg != null){
        val count = msg.length
        println(count)
    }*/
    /*Option#02 - Using signal of ?
    val count = msg?.length
    println(count)
     */
    /*Option#03 - (Best Option) Using signal of ? and ?: */
    val count = msg?.length ?: 0
    println(count)

    /*Option#04 - Using the function let
    msg?.let {
        val count = it.length
        println(count)
    }*/
    /*Option#05 - (not recomemnded)Using signal !! to unzip the msg
    val count = msg!!.length
    println(count)
     */

}

fun conditionWhen() {
    val age = 12
    when (age) {
        in 0..15 -> println("Está dentro da idade")
        in 16..31 -> println("Está fora da idade")
    }
}

fun sum(x: Double, y: Double = 8.0): Double {
    return x + y
}

fun printInt(number: Int) {
    println("a variável é um inteiro: $number.")
}

fun doubleToInt() {
    val age = 28
    val price = 20.2
    printInt(age)
    printInt(price.toInt())
}