class Pertence(marca: String, modelo: String): Peca(marca, modelo) {
    override fun retirada() {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "Pertence($marca, $modelo)"
    }
}