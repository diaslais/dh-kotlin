fun main(){
    val numeros = ArrayList<Int>()

    for(i in 1..5){
        print("Digite um número: ")
        var numero = readLine()!!.toInt()

        numeros.add(numero)
    }
    println(numeros)
}