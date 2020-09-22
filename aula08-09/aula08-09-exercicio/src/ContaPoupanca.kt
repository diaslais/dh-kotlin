class ContaPoupanca (
    conta: Int,
    saldo: Double,
    val limite: Double
): ContaBancaria(conta, saldo){

    override fun sacar(valor: Double): Boolean {
        if((this.saldo + this.limite) >= valor){
            this.saldo -= valor
            return true
        } else{
            println("Saldo insuficiente")
            return false
        }
    }

    override fun depositar(valor: Double): Boolean {
        this.saldo += valor
        return true
    }

    override fun mostraDados() {
        super.mostraDados()
        println("Limite: $limite")
    }
}