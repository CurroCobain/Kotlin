fun main(args: Array<String>) {
    println("introduce una frase: ")
    var frase=readln().toString()
    var frasenoespacios=frase.split(" ")
    var frasecompara1=""
    for(palabra in frasenoespacios){
        frasecompara1+=palabra
    }
    var frasecompara2=frasecompara1.reversed()
    if (frasecompara1==frasecompara2){
        println("La frase es capicua")
    }else{
        println("La frase no es capicua")
    }
}