fun main(){
    val numeros = ArrayList<Int>()

    for(i in 1..10){
        print("Digite um número: ")
        var numero = readLine()!!.toInt()

        numeros.add(numero)
    }
    numeros.reverse()
    println(numeros)
}