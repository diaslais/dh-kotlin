fun main() {
    print("Digite o peso dos peixes: ")
    var peso = readLine()!!.toDouble()

    var excesso : Double = 0.0
    if(peso > 50){
        excesso = (peso - 50)
    }
    var multa = excesso * 4

    println("\nExcedeu ${"%.1f".format(excesso)}Kg")
    println("O valor a ser pago é de R$ ${"%.2f".format(multa)}")
}