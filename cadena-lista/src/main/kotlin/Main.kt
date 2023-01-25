fun main() {
    println("Introduce una palabra")
    val cadena= readln().toString()
    val listacadena: MutableList<String> = mutableListOf()
    for (letra in cadena){
        listacadena.add(letra.toString())
    }
    println("""
           Elija que quiere hacer: 
           1) mostrar el resutado, 
           2) insertar una letra, 
           3) modificar una letra, 
           4) borrar una letra por indice
           """.trimIndent())
    var opcion=0
    opcion= readln().toInt()
    when (opcion){
        1->println(listacadena)
        2->{var num=0
            var letra=""
        println("Elija la posicion donde quiere añadir la letra")
        num= readln().toInt()
        println("Introduzca la letra que quiere añadir: ")
        letra= readln()
        listacadena.add(num,letra)
        }
        3-> {var pos=0
        println("Elija la posición que quiere cambiar")
        pos= readln().toInt()
        var cambio=""
        println("Dime que letra quieres poner")
        cambio=readln()
        listacadena[pos]=cambio}
        4->{println("Elija la posición que quiere borrar")
        var borrar=0
        borrar=readln().toInt()
        listacadena.removeAt(borrar)
        }
        5->{var borrarletra=""
        println("Dime que letra quieres borrar")
        borrarletra=readln().toString()
        var letra=""
        for ((index,values) in listacadena.withIndex()){
            letra=listacadena[index].toString()
            if (letra==borrarletra){
                listacadena.removeAt(index)
                break
            }
        }}



    }
    println(listacadena)
}