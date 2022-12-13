fun main() {
    /*Example#01 - Generics
    val mPersonList = MyArrayImpl<OtherPerson>()
    mPersonList.addItem(OtherPerson("Gleides", 42))
    mPersonList.addItem(OtherPerson("Ana Rosa", 7))
    mPersonList.printItems()
    val mStringList = MyArrayImpl<String>()
    mStringList.addItem("Maça")
    mStringList.addItem("Abacaxi")
    mStringList.printItems()
     */
    /*Example#02.1 - Lambdas */
    handleInt(10){
        println("Result: ${it * 5}")
    }
    /*Example#02.2 - Lambdas */
    handleInt(10){num ->
        println("Result: ${num * 5}")
    }
    /*Example#02.3 - Lambdas using Filter */
    val frutas = arrayListOf<String>()
    frutas.add("Maça")
    frutas.add("Melancia")
    frutas.add("Banana")
    frutas.add("Abacate")
    frutas.add("Açai")
    val filtered = frutas.filter {
        it.startsWith("A")
    }
    println(filtered)
}
/** Lambda */
fun handleInt(x:Int, operation: (Int)->Unit){
    operation(x)
}
/** Impl Class */
class MyArrayImpl<T>:MyArray<T>{
    var items = arrayListOf<T>()
    override fun addItem(item: T) {
        items.add(item)
    }

    override fun removeItem(item: T) {
        items.remove(item)
    }
    fun printItems(){
        items.forEachIndexed { index, element ->
            println("index[$index] do element: $element")
        }
    }

}
/** Interface */
interface MyArray<T> {
    fun addItem(item: T)
    fun removeItem(item: T)
}
/** Data Class */
data class OtherPerson(val nome: String, val idade: Int)