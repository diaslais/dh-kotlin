fun main(){
    //preço negativo e quantidade negativa
    val fatura = Fatura()

    var item1 = Item(1, "item1", 2, -1.0)
    var item2 = Item(4, "item2", -1, 1.0)

    fatura.listaDeItems.add(item1)
    fatura.listaDeItems.add(item2)

    println(fatura.getTotalFatura())

    //preço positivo e quantidade positiva
    val fatura2 = Fatura()

    item1 = Item(1, "item1", 2, 1.0)
    item2 = Item(4, "item2", 3, 1.0)

    fatura2.listaDeItems.add(item1)
    fatura2.listaDeItems.add(item2)

    println(fatura2.getTotalFatura())
}
