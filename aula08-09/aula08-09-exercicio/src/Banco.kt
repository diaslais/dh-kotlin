class Banco(): Imprimivel{
    var contasBancarias = arrayListOf<ContaBancaria>()

    fun inserir(conta: ContaBancaria){
        this.contasBancarias.add(conta)
    }

    fun remover(conta: ContaBancaria){
        this.contasBancarias.remove(conta)
    }

    fun procurarConta(conta: Int): ContaBancaria? {
        for(i in contasBancarias.indices){
            if(conta == contasBancarias[i].getConta()){
                return contasBancarias[i]
            }
        }
        return null
    }

    override fun mostraDados(){
        for(i in contasBancarias.indices){
            contasBancarias[i].mostraDados()
            println("")
        }
    }

}