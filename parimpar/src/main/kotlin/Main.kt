fun main() {
    println("Introduzca un numero ")
    val num = readln().toInt()
    println("$num es un número ${if ((num%2)!=0) "es impar" else "es par"}")


}