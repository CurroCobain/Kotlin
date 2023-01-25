fun main() {
    println("introduce tu nota: ")
   val nota = readln().toInt()
    when (nota) {
        1,2,3,4 -> println("Lo siento, estas suspenso")
        5 -> println("Has aprobado")
        6 -> println(" Has sacado un bien")
        7, 8 -> println("Tienes un notable!")
        9, 10 -> println(" Enhorabuena tienes un sobresaliente!!")
        else -> println("Nota no válida")
    }
}
