import java.util.concurrent.locks.Condition

fun main() {
    /*Example#01 - Flow control with For with Range
    forWithRange()
     */
    /*Example#02 - Method Overloading
    println("a soma = ${overSum(2,5)}")
     */
    /*Example#03 - Functions as variable
    funcWithVar()
     */
    /*Example#04 - Functions as parameter
    funcWithParameter(20,2, ::overSum)
    funcWithParameter(20,2, ::subtract)
     */
    /*Example#05 - Alias */
    funcWithAlias(20,2, ::overSum)
    funcWithAlias(20,2, ::subtract)

}
/**Example05: Define condition as Alias*/
typealias Operation = (Int, Int) -> Int
fun funcWithAlias(x: Int, y: Int, condition: Operation) {
    println("Result = ${condition(x, y)}")
}

/**Example04: Define function as parameter*/
fun funcWithParameter(x: Int, y: Int, condition: (Int, Int) -> Int) {
    println("Result = ${condition(x, y)}")
}

/**Example03: Define function as var*/
fun funcWithVar() {
    var funGeneric: (Int, Int) -> Int
    funGeneric = ::overSum
    println("Result = ${funGeneric(10, 5)}")
    funGeneric = ::subtract
    println("Result = ${funGeneric(10, 5)}")
}

fun subtract(x: Int, y: Int): Int {
    return x - y
}

fun overSum(x: Int, y: Int): Int {
    return x + y
}

fun overSum(x: Double, y: Double): Double {
    return x + y
}

fun forWithRange() {
    for (i in 0..10) {
        println("Index[i=$i]")
    }
}

