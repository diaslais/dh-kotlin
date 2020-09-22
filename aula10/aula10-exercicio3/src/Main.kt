fun main(){
    val estoque = Estoque("produto1", 5, 1)

    estoque.mudarNome("produto2")

    estoque.mudarQtdMinima(2)

    estoque.repor(2)

    estoque.darBaixa(1)

    println(estoque.mostra())

    println(estoque.precisaRepor())
}