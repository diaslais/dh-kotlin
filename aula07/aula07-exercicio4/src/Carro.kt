class Carro(var consumo: Int){
    var combustivel: Int = 0

    fun andar(km: Int){
        this.combustivel -= (km / this.consumo)
    }

    fun obterGasolina() = println(this.combustivel)

    fun adicionarGasolina(quantiaEmLitros: Int){
        this.combustivel += quantiaEmLitros
    }
}