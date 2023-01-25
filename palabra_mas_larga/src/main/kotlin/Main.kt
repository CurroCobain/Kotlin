fun main(args: Array<String>) {
    val cadena = "Aprobar programación es muy dificil"
    var compara = 0
    val cadenaCompara = cadena.split(" ")
    println(cadenaCompara)
    var maslarga = ""
    for (palabra in cadenaCompara) {
        if (palabra.length > compara) {
            maslarga = palabra
            compara=palabra.length
        }
    }
    println("${maslarga.uppercase()} es la palabra más larga de la frase")
}