fun main(){
    println("Digite a seguir dois números inteiros: ")
    var numero1 = readLine()!!.toInt()
    var numero2 = readLine()!!.toInt()

    for(i in (numero1 + 1)..(numero2 - 1)){
        println(i)
    }
}