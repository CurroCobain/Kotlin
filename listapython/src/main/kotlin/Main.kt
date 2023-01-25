fun main() {
    val listademierda= mutableListOf("a","b","c")
    //println(listademierda.size)//
    listademierda.add("d")
    println(listademierda.size)
    println(listademierda.last())
    println(listademierda[0])
    println(listademierda)
    listademierda[0]="e"
for ((index,value) in listademierda.withIndex()){
    println(value)
    }
}