import javax.annotation.processing.Generated
import javax.xml.crypto.Data

fun main() {
    /*Example#01 - Class and Constructors
    val pai = Person("Gleides")
    val filha = Person("Ana",  "Rosa")
    println("Pai é: ${pai.fistName}")
    println("Minha filha é: ${filha.fistName} ${filha.lastName}")
     */
    /*Example#02 - Initialization
    val pessoa = MyPerson("Gleides", "Vinente")
     */

    /*Example#03 - Inheritance
    val pipira = Ave("Ana Rosa")
    pipira.voa()
    pipira.anda()
    pipira.corre()
    pipira.come()
     */
    /*Example#04 - Data Class */
    val student = DataPerson("Gleides", 42)

    println(student)

}
/** Data Class*/
data class DataPerson(val nome: String, val idade: Int)

/** Inheritance - Parent Class*/
abstract class Animal(val nome: String) {
    init {
        println("Meu nome é: $nome")
    }

    fun anda() {
        println("Andando...!")
    }

    fun corre() {
        println("Correndo...!")
    }

    open fun come() {
        println("Comendo...!")
    }
}

/** Inheritance - Child Class*/
class Ave(nome: String) : Animal(nome) {
    fun voa() {
        println("Voando...!")
    }

    /** Override on method Parent Class */
    override fun come() {
        println("Comendo muito...!")
    }
}

/** Initialization using Primary Constructor*/
class MyPerson(var fistName: String, var lastName: String) {
    var fullName: String = "$fistName $lastName"

    init {
        println(fullName)
    }
}

/** Primary Constructor */
class Person(var fistName: String) {
    var lastName: String? = null

    /** Secondary Constructor */
    constructor(fistName: String, lastName: String) : this(fistName) {
        this.lastName = lastName
    }
}
