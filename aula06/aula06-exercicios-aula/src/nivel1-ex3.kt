fun main(){
    val alturas = ArrayList<Double>()

    for(i in 1..5){
        print("Digite sua altura: ")
        var altura = readLine()!!.toDouble()

        alturas.add(altura)
    }
    alturas.reverse()
    println(alturas)
}