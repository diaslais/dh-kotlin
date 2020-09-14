fun par(numero: Int) = numero % 2 == 0

fun main() {
    println("Digite um número: ")
    var numero = readLine()!!.toInt()

    println(par(numero))
}