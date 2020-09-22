import kotlin.math.max

class Item(
    val numeroDoItem: Int,
    val descricao: String,
    var quantidadeComprada: Int,
    var precoUnitario: Double
) {
    init {
        quantidadeComprada = max(0, quantidadeComprada)
        precoUnitario = max(0.0, precoUnitario)
    }
}