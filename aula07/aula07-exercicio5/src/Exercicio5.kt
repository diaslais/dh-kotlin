fun main(){
    var carro = Veiculo("Fiat", "Palio", 2012, "preto", 40000)
    var cliente1 = Cliente("Maria", "Silva", "(11)93333-3333")
    var concessionaria1 = Concessionaria()

    concessionaria1.registrarVenda(carro, cliente1, 20000.0)
}