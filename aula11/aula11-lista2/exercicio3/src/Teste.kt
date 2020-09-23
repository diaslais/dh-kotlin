fun main(){
    val calculoMatematico = CalculoMatematico()

    try {
        println(calculoMatematico.divisao(4, 0))
    } catch (ex: ArithmeticException){
        println(ex.message)
    }

}