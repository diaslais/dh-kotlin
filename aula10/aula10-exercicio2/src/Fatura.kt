class Fatura {
    val listaDeItems = ArrayList<Item>()

    fun getTotalFatura(): Double{
        var total = 0.0
        listaDeItems.forEach{
            total += (it.quantidadeComprada * it.precoUnitario)
        }
        return total
    }

}
