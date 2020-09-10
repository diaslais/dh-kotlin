fun main () {
    print("Informe a temperatura em graus Fahrenheit: ")
    val f = readLine()!!.toDouble()

    val c = 5 * ((f - 32) / 9)

    println("A temperatura em graus Celsius é: ${"%.2f".format(c)}")
}