fun somaImposto(taxaImposto: Double, custo: Double) = custo + (custo * taxaImposto / 100)

fun main() {
    print("Informe a taxa de imposto: ")
    var taxa = readLine()!!.toDouble()
    print("Informe o custo inicial do produto: ")
    var custo = readLine()!!.toDouble()

    println("R$ ${"%.2f".format(somaImposto(taxa, custo))}")
}