fun main(){
    val jaqueta = Pertence("Zara", "Jaqueta de couro")
    val bolsa = Pertence("Arezo", "Bolsa preta")
    val cachecol = Pertence("Sem marca", "Cachecol cinza")
    val blusa = Pertence("Adidas", "Blusa com zíper")
    var cardiga = Pertence("Renner", "Cardigã azul")

    val guardaVolumes = GuardaVolumes(mutableMapOf(), 0)

    guardaVolumes.guardarPecas(mutableListOf(jaqueta, bolsa))
    guardaVolumes.guardarPecas((mutableListOf(cachecol)))
    guardaVolumes.guardarPecas(mutableListOf(blusa, cardiga))

    //mostrar todas as peças
    guardaVolumes.mostrarPecas()

    //mostrar as peças do identificador 2
    guardaVolumes.mostrarPecas(2)

    //devolve as peças do indentificador 1
    guardaVolumes.devolverPecas(1)

    //mostra todas as peças após a retirada
    guardaVolumes.mostrarPecas()
}