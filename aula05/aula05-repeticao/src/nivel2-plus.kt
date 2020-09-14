fun main() {
    //mais alto
    var altoCodigo = 0
    var altoAltura = 0.0
    var altoPeso = 0.0

    //mais baixo
    var baixoCodigo = 0
    var baixoAltura = 0.0
    var baixoPeso = 0.0

    //mais gordo
    var gordoCodigo = 0
    var gordoAltura = 0.0
    var gordoPeso = 0.0

    //mais magro
    var magroCodigo = 0
    var magroAltura = 0.0
    var magroPeso = 0.0

    var somaAlturas = 0.0
    var somaPesos = 0.0

    print("Informe seu código de cliente: ")
    var codigo = readLine()!!.toInt()

    if(codigo != 0){
        print("Informe sua altura: ")
        var altura = readLine()!!.toDouble()
        print("Informe seu peso: ")
        var peso = readLine()!!.toDouble()
        baixoAltura = altura
        altoAltura = altura
        gordoAltura = altura
        magroAltura = altura
        baixoCodigo = codigo
        altoCodigo = codigo
        gordoCodigo = codigo
        magroCodigo = codigo
        altoPeso = peso
        baixoPeso = peso
        gordoPeso = peso
        magroPeso = peso

        somaAlturas += altura
        somaPesos += peso

        var numClientes = 1

        while (true) {
            print("\nInforme seu código de cliente: ")
            codigo = readLine()!!.toInt()
            if (codigo == 0){
                break
            }
            print("Informe sua altura: ")
            altura = readLine()!!.toDouble()
            print("Informe seu peso: ")
            peso = readLine()!!.toDouble()

            if(altura > altoAltura){
                altoCodigo = codigo
                altoAltura = altura
                altoPeso = peso
            } else if(altura < baixoAltura){
                baixoCodigo = codigo
                baixoAltura = altura
                baixoPeso = peso
            }

            if(peso > gordoPeso){
                gordoCodigo = codigo
                gordoAltura = altura
                gordoPeso = peso
            } else if(peso < magroPeso){
                magroCodigo = codigo
                magroAltura = altura
                magroPeso = peso
            }
            numClientes++
            somaAlturas += altura
            somaPesos += peso
        }

        println("\nCliente mais alto\nCódigo de cliente: $altoCodigo\nAltura: ${"%.2f".format(altoAltura)}\nPeso: ${"%.1f".format(altoPeso)}")
        println("\nCliente mais baixo\nCódigo de cliente: $baixoCodigo\nAltura: ${"%.2f".format(baixoAltura)}\nPeso: ${"%.1f".format(baixoPeso)}")
        println("\nCliente mais gordo\nCódigo de cliente: $gordoCodigo\nAltura: ${"%.2f".format(gordoAltura)}\nPeso: ${"%.1f".format(gordoPeso)}")
        println("\nCliente mais magro\nCódigo de cliente: $magroCodigo\nAltura: ${"%.2f".format(magroAltura)}\nPeso: ${"%.1f".format(magroPeso)}")
        println("\nA média das alturas é: ${"%.2f".format((somaAlturas / numClientes))}")
        println("A média dos pesos é: ${"%.1f".format((somaPesos / numClientes))}")
    }
}