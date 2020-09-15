class Conta (var titular: Cliente, var numeroConta: Int, var saldo: Double){

    fun deposito(valor: Double){
        this.saldo += valor
        println("Foi realizado um depósito de R$ $valor. O saldo atual é: R$ ${this.saldo}")
    }

    fun saque(valor: Double){
        if (valor > this.saldo){
            println("Saldo insuficiente")
        } else{
            this.saldo -= valor
            println("Foi realizado um saque de R$ $valor. O saldo atual é: R$ ${this.saldo}")
        }
    }
}