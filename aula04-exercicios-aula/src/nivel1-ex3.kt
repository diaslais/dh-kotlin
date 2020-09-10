fun main() {
    print("Digite o valor em metros: ")
    var metros = readLine()!!.toInt()

    var centimetros = metros * 100

    println("O valor em centímetros é: ${centimetros}cm")
}