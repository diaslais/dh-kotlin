class Conta (titular: Cliente){
    var numeroConta: Int = 0
    var saldo: Double = 0.0


    fun deposito(valor: Double){
        this.saldo += valor
        println("Foi realizado um depósito de R$ $valor. O saldo atual é: R$ ${this.saldo}")
    }

    fun saque(valor: Double){
        if (valor > saldo){
            println("Saldo insuficiente")
        } else{
            this.saldo -= valor
            println("Foi realizado um saque de R$ $valor. O saldo atual é: R$ ${this.saldo}")
        }
    }
}