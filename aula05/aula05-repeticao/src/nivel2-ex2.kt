fun main() {
    print("Qual a quantidade de CDs? ")
    var quantidadeCds = readLine()!!.toInt()
    var totalGasto = 0.0

    for(i in 1..quantidadeCds){
        print("Qual o valor gasto no CD número ${i}? ")
        var valor = readLine()!!.toDouble()
        totalGasto += valor
    }
    var valorMedio = totalGasto / quantidadeCds
    println("O valor total investido na coleção é de R$ ${"%.2f".format(totalGasto)} e o valor médio gasto em cada um é de R$ ${"%.2f".format(valorMedio)}")
}