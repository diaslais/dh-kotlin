abstract class ContaBancaria (
    private val conta:Int,
    protected var saldo: Double
): Imprimivel {

    abstract fun sacar(valor: Double): Boolean
    abstract fun depositar(valor: Double): Boolean

    override fun mostraDados() {
        println("Conta: $conta")
        println("Saldo: $saldo")
    }

    fun transferir(valorTransferencia: Double, contaDestino: ContaBancaria){
        if(!this.sacar(valorTransferencia) || !contaDestino.depositar(valorTransferencia)){
            println("O valor não pode ser transferido")
        } else{
            this.sacar(valorTransferencia)
            contaDestino.depositar(valorTransferencia)
            println("Transferência realizada.")
        }
    }

    fun getConta(): Int{
        return this.conta
    }
}