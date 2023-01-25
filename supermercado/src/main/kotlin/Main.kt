fun main() {
    supermercado()
}
fun supermercado(){
    val supermercado= mutableMapOf<String,Double>()
    while (supermercado.size <4){
        println("Dime el nombre del producto")
        var nombre=readln().toString()
        println("Dime el precio del producto")
        var precio=readln().toDouble()
        supermercado.put(nombre, precio)
    }
    println("Listado de productos")
    for ((key,value) in supermercado){
        println(" $key ====== $value")
    }
}