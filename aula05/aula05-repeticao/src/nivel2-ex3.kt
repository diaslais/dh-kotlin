fun main(){
    print("Digite o número desejado: ")
    var numero = readLine()!!.toInt()

    println("Tabuada de $numero:")
    for(i in 1..10){
        println("$numero X $i = ${numero * i}")
    }
}