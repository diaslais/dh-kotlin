fun main() {
    //passo 6
    val contaCorrente = ContaCorrente(111, 100.0, 10.0)
    val contaPoupanca = ContaPoupanca(222, 200.0, 50.0)

    contaCorrente.depositar(80.0)
    contaPoupanca.depositar(50.0)
    contaCorrente.sacar(30.0)
    contaPoupanca.sacar(260.0)

    val relatorio = Relatorio()
    relatorio.gerarRelatorio(contaCorrente)
    println("")
    relatorio.gerarRelatorio(contaPoupanca)
    println("")

    //passo 10
    val banco = Banco()
    banco.inserir(contaCorrente)
    banco.inserir(contaPoupanca)

    // menu inicial
    var entrada = leMenuInicial()

    var conta: ContaBancaria
    var numeroConta: Int
    var saldo: Double
    var taxa: Double
    var limite: Double
    var tipoDeConta: Int

    while(entrada != 5){
        when(entrada){
            1 -> {
                print("Criar conta - Insira 1 para conta corrente e 2 para conta poupança: ")
                tipoDeConta = readLine()!!.toInt()
                while(tipoDeConta != 1 && tipoDeConta != 2){
                    println("Opção inválida.")
                    print("Criar conta: Insira 1 para conta corrente e 2 para conta poupança: ")
                    tipoDeConta = readLine()!!.toInt()
                }
                print("Informe o número da conta: ")
                numeroConta = readLine()!!.toInt()
                print("Informe o saldo: ")
                saldo = readLine()!!.toDouble()
                if(tipoDeConta == 1){
                    print("Informe a taxa de operação: ")
                    taxa = readLine()!!.toDouble()
                    conta = ContaCorrente(numeroConta, saldo, taxa)
                } else{
                    print("Informe o limite: ")
                    limite = readLine()!!.toDouble()
                    conta = ContaPoupanca(numeroConta, saldo, limite)
                }
                banco.inserir(conta)
                println("A conta foi criada com sucesso!")
            }
            2 -> {
                print("Informe o número da conta: ")
                numeroConta = readLine()!!.toInt()
                if(banco.procurarConta(numeroConta) == null){
                    println("Conta inexistente.")
                } else{
                    //menu interno
                    var entradaInterno = leEntradaInterna()

                    loop@ while (entradaInterno != "e"){
                        when(entradaInterno){
                            "a" -> {
                                print("Informe o valor que deseja depositar: ")
                                var valor = readLine()!!.toDouble()
                                banco.procurarConta(numeroConta)!!.depositar(valor)
                            }
                            "b" -> {
                                print("Informe o valor que deseja sacar: ")
                                var valor = readLine()!!.toDouble()
                                banco.procurarConta(numeroConta)!!.sacar(valor)
                            }
                            "c" -> {
                                print("Informe o valor que deseja transferir: ")
                                var valor = readLine()!!.toDouble()
                                print("Informe o númedo da conta de destino: ")
                                var contaDestino = readLine()!!.toInt()
                                if(banco.procurarConta(contaDestino) == null){
                                    println("Conta inexistente.")
                                } else{
                                    banco.procurarConta(numeroConta)!!.transferir(valor, banco.procurarConta(contaDestino)!!)
                                }
                            }
                            "d" -> {
                                banco.procurarConta(numeroConta)!!.mostraDados()
                            }
                            "e" -> {
                                println("Retornar ao menu anterior")
                                break@loop
                            }
                        }
                        entradaInterno = leEntradaInterna()
                    }
                }
            }
            3 -> {
                print("Informe o número da conta: ")
                numeroConta = readLine()!!.toInt()
                if(banco.procurarConta(numeroConta) == null){
                    println("Conta inexistente.")
                } else{
                    banco.remover(banco.procurarConta(numeroConta)!!)
                    println("A conta foi removida com sucesso.")
                }
            }
            4 -> {
                banco.mostraDados()
            }
            5 -> {
                println("Fim da aplicação.")
            }
        }
        entrada = leMenuInicial()
    }
}

fun leMenuInicial(): Int {
    println("1 - Criar conta")
    println("2 - Selecionar conta")
    println("3 - Remover conta")
    println("4 - Gerar relatório")
    println("5 - Finalizar")
    print("Informe o número da opção desejada: ")
    val entrada = readLine()!!.toInt()
    return entrada
}

fun leEntradaInterna(): String {
    println("a - Depositar")
    println("b - Sacar")
    println("c - Transferir")
    println("d - Gerar relatório")
    println("e - Retornar ao menu anterior")
    print("Informe a letra correspondente à opção desejada: ")
    val menuInterno = readLine()!!.toLowerCase()
    return menuInterno
}