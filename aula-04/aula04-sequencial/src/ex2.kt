fun main() {
    print("Quanto vale sua hora? ")
    var valorHora = readLine()!!.toDouble()
    print("Quantas horas você trabalhou? ")
    var horasTrabalhadas = readLine()!!.toDouble()

    var valorFinal = valorHora * horasTrabalhadas

    println("\nVocê receberá R$ ${"%.2f".format(valorFinal)}")
}