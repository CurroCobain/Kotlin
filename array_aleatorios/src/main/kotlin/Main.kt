fun main(args: Array<String>) {
    println("Introduce cuantos números aleatorios quieres añadir: ")
    var tamaño = readln().toInt()
    var myArray = IntArray(tamaño, { 0 })
    var mayor = "0"
    var menor = 0
    /*var aleatorio=(0..10).random()*/
    for ((i,values) in myArray.withIndex()) {
        myArray[i] = (0..10).random()
    }
    for ((i,values) in myArray.withIndex()) {
        if (myArray[i]>mayor){
            var mayor =  myArray[i]
        }
        else {
            if ( myArray[i] < menor) {
                menor =  myArray[i]
            }
        }
    }
            println("${myArray.contentToString()} $menor $mayor")
}