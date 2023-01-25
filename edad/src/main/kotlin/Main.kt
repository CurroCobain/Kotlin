fun main(args: Array<String>) {
    val año=2022
    println("Introduzca su año de nacimiento")
    val nac = readln().toInt()
    val edad=año - nac
    println("su edad es de $edad")
}