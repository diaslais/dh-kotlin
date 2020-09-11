fun main(){
    print("Digite um número: ")
    var maiorNumero = readLine()!!.toInt()
    for(i in 1..4){
        print("Digite um número: ")
        var numero = readLine()!!.toInt()

        if(numero > maiorNumero){
            maiorNumero = numero
        }
    }
    println("O maior número é: $maiorNumero")
}