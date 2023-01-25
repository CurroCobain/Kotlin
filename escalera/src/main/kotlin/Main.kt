fun main(args: Array<String>) {
    println("Introduzca un número ")
    val num = readln().toInt()
    var punto = "*"
    for (i in 0..num) {
        println(punto)
        punto+="*"
    }
}