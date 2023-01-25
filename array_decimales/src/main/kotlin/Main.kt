fun main(args: Array<String>) {
    println("Dime cuantos números quieres añadir: ")
    var tamaño=readln().toInt()
    val myArray= DoubleArray(tamaño,{0.0})

    var i=0
    while (i < myArray.size){
        println("Dime el número que quieres introducir: ")
        myArray[i]=readln().toDouble()
        i++
    }
    println("${myArray.contentToString()}")
}