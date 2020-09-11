fun main(){
    print("Qual o número de matérias realizadas? ")
    var numeroMaterias = readLine()!!.toInt()
    var somaDasNotas = 0.0

    for(i in 1..numeroMaterias){
        print("Digite a nota da matéria $i: ")
        var nota = readLine()!!.toDouble()
        somaDasNotas += nota
    }
    var mediaAritmetica = somaDasNotas / numeroMaterias
    println("A média aritmética é ${"%.1f".format(mediaAritmetica)}")
}