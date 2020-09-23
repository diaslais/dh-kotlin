class CalculoMatematico() {

    fun divisao(valor1: Int, valor2: Int): Int {

        if(valor2 == 0){
            throw ArithmeticException("Não pode dividir por zero")
        }
        return valor1 / valor2
    }
}