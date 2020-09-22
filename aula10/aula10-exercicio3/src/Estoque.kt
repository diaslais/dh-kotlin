import kotlin.math.max

class Estoque(
    var nome: String,
    var qtdAtual: Int,
    var qtdMinima: Int
) {

    fun mudarNome(nome: String){
        this.nome = nome
    }

    fun mudarQtdMinima(qtdMinima: Int){
        if( qtdMinima < 0){
            throw Exception("Quantidade não pode ser negativa.")
        }
        this.qtdMinima = qtdMinima
    }

    fun repor(qtd: Int){
        this.qtdAtual += qtd
    }

    fun darBaixa(qtd: Int){
        if( qtdAtual - qtd < 0){
            throw Exception("Quantidade não pode ser negativa.")
        }
        this.qtdAtual -= qtd
    }

    fun mostra() = "Nome do produto: $nome \nQuantidade mínima: $qtdMinima \nQuantidade atual: $qtdAtual"

    fun precisaRepor() = qtdAtual <= qtdMinima
}