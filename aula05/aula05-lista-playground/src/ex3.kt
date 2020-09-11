fun par(numero: Int): Boolean{
    if(numero % 2 == 0){
        return true
    }
    return false
}

fun main() {
    println("Digite um número: ")
    var numero = readLine()!!.toInt()

    println(par(numero))
}