fun main() {
    print("Digite a altura: ")
    var h = readLine()!!.toDouble()

    var homens = (72.7 * h) - 58
    var mulheres = (62.1 * h) - 44.7

    println("\nPara homens: ${"%.2f".format(homens)}")
    print("Para mulheres: ${"%.2f".format(mulheres)}")
}