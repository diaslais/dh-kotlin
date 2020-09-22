class ContaCorrente (
    conta: Int,
    saldo: Double,
    val taxaDeOperacao: Double
): ContaBancaria(conta, saldo){

    override fun sacar(valor: Double): Boolean {
        if(this.saldo >= (valor + this.taxaDeOperacao)){
            this.saldo -= (valor + this.taxaDeOperacao)
            return true
        } else{
            println("Saldo insuficiente")
            return false
        }
    }

    override fun depositar(valor: Double): Boolean {
        if(valor > this.taxaDeOperacao){
            this.saldo += (valor - this.taxaDeOperacao)
            return true
        } else{
            println("Valor insuficiente")
            return false
        }
    }

    override fun mostraDados() {
        super.mostraDados()
        println("Taxa de operação: $taxaDeOperacao")
    }

}