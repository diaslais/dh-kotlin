class Concessionaria (){
    var registroDeVenda = arrayListOf<Venda>()

    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: Double){
        var venda = Venda(valor, veiculo, cliente)
        registroDeVenda.add(venda)
    }
}