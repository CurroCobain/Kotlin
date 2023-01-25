fun main() {
    println("introduce una palabra")
    val palabra=readln().toString()
    var palabra_girada="" /*palabra.reversed*/
    var x=palabra.length
    while (x > 0){
        palabra_girada=palabra_girada+palabra[x-1]
        x=x-1
    }
    if (palabra_girada==palabra){
        println("$palabra es capicua")
    }else{
        println("$palabra no es capicua")
    }
}