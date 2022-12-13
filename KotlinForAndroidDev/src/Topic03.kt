fun main() {
    /*Example#01 - Arrays
    funArrays()
     */
    /*Example#02- ArrayLists
    funArrayLists()
    */
    /*Example#03- ArrayLists
    funLists()
    */
    /*Example#04- Maps*/
    funMaps()

}

fun funMaps() {
    //Can't be change element Map
    val myMap = mapOf(
        "BR" to "Brazil",
        "US" to "United States",
        "FR" to "França",
        "EN" to "Inglaterra"
    )
    println(myMap)
    //Can be change element Map
    val mutableMap = mutableMapOf(
        "BR" to "Brazil",
        "US" to "United States",
        "FR" to "França",
        "EN" to "Inglaterra"
    )
    for(key in mutableMap.keys){
        println("Key: $key")
    }
    println(mutableMap)
    for((key, value) in mutableMap){
        println("Key: $key | Value: $value")
    }
    println(mutableMap)
    mutableMap.set("EN", "England")
    println(mutableMap)
    mutableMap.remove("FR")
    println(mutableMap)
}

fun funLists() {
//Can't be change element List
    val myList = listOf("Gleides", "Karina", "Ana Rosa", "João Gabriel")
    println(myList)
//Can be change element List
    val mutableList = mutableListOf("Gleides", "Karina", "Ana Rosa", "João Gabriel")
    mutableList.add("Vinente")
    mutableList.add("Monteiro")
    println(mutableList)
}

fun funArrayLists() {
    val arrayList = arrayListOf<Int>(11, 21, 33, 44, 51, 67, 17)
    arrayList.add(9)
    arrayList.add(8)
    arrayList.add(10)
    println(arrayList)
    arrayList.remove(33)
    println(arrayList)
    arrayList.addAll(arrayListOf(33, 36, 42, 55, 68, 43))
    println(arrayList)
    arrayList.forEach { i: Int ->
        println(i)
    }
}

fun funArrays() {
    val nums = arrayOf(1, 2, 3, 4, 5, 6)
    println(nums.size)
    println(nums.isEmpty())
    println(nums.first())
    println(nums.sliceArray(0..2).size)
    println(nums.contains(5))
//Remove array items
    val num = nums.drop(4)
    println(num)
//print elements array
    nums.forEachIndexed { index, i ->
        println("Index:[$index] | Element: $i")
    }
}