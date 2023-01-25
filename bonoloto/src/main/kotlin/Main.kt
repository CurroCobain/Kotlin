fun main() {
val bonoloto: MutableList<Int> = mutableListOf()
    while (bonoloto.size < 5) {
        var número = 0
        println("dime un número")
        número = readln().toInt()
        if (número in bonoloto) {
            println("ese número ya esta")
        } else {
            bonoloto.add(número)
        }
    }
    bonoloto.sort()
println("Tus números son: $bonoloto")
}