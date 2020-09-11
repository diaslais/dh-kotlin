fun main() {
    print("Digite a primeira nota: ")
    var nota1 = readLine()!!.toDouble()

    print("Digite a segunda nota: ")
    var nota2 = readLine()!!.toDouble()

    var media = (nota1 + nota2) / 2

    if(media == 10.0){
        println("Aprovado com Distinção")
    } else if(media >= 7.0){
        println("Aprovado")
    } else{
        println("Reprovado")
    }
}