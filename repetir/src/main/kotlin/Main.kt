fun main(args: Array<String>) {
    println("Introduzca una palabra: ")
    val palabra=readln().toString()
    println("Introduce un número ")
    val num=readln().toInt()
    println("$palabra \n".repeat(num))
}