fun positivoOuNegativo(numero: Int) = if(numero > 0) "P" else "N"

fun main() {
    print("Digite um número: ")
    var num = readLine()!!.toInt()

    println("Resultado: ${positivoOuNegativo(num)}")
}