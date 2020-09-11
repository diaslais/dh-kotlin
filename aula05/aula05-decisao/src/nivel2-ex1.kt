fun main(){
    print("Digite um número para verificar se é par ou ímpar: ")
    var numero = readLine()!!.toInt()

    if(numero % 2 == 0){
        println("é par!")
    } else{
        println("é impar!")
    }
}