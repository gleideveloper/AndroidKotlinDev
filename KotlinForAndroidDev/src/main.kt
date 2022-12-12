fun main() {
    /*Exemplo#01 - Converte double para inteiro
    doubleToInt()
     */
    /*Exemplo#02 - Imprimindo um função concatenada com String
    val price = 20.2
    val price2 = 2.2
    println("a soma = ${sum(price, price2)}")
     */
    /*Exemplo#03 - Clausula When
    conditionWhen()
     */
    /*Exemplo#03 -  Check null available*/
    checkForNull()
}



fun checkForNull() {
    var msg: String? = "texto"
    //msg = null
    /*Option#01 - Usando o if
    if (msg != null){
        val count = msg.length
        println(count)
    }*/
    /*Option#02 - Usando sinal de ?
    val count = msg?.length
    println(count)
     */
    /*Option#03 - (Melhor opção) Usando sinal de ? e ?: */
    val count = msg?.length ?: 0
    println(count)

    /*Option#04 - Usando a function let
    msg?.let {
        val count = it.length
        println(count)
    }*/
    /*Option#05 - (não recomendável)Pior opção de toda usando sinal !! para descompactar a msg
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

fun sum(x: Double, y: Double): Double {
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