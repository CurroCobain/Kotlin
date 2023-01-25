fun main(args: Array<String>) {
    var numeros_impares=1
    print("dime un número: ")
    val número=readln().toInt()

    while (número > numeros_impares) {
        print("$numeros_impares ,")
        numeros_impares += 2
        if (número - numeros_impares < 0)
            print("\b")
    }
}