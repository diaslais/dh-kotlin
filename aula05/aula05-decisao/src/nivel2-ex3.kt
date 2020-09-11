fun main() {
    var quantidadeSim = 0

    println("Responda as perguntas com 'S' para sim ou 'N' para não")
    print("Telefonou para a vítima? ")
    var telefonou = readLine()!!.toUpperCase()
    if(telefonou.equals("S")) quantidadeSim += 1
    print("Esteve no local do crime? ")
    var esteveNoLocal = readLine()!!.toUpperCase()
    if(esteveNoLocal.equals("S")) quantidadeSim += 1
    print("Mora perto da vítima? ")
    var moraPerto = readLine()!!.toUpperCase()
    if(moraPerto.equals("S")) quantidadeSim += 1
    print("Devia para a vítima? ")
    var devia = readLine()!!.toUpperCase()
    if(devia.equals("S")) quantidadeSim += 1
    print("Já trabalhou com a vítima? ")
    var jaTrabalhou = readLine()!!.toUpperCase()
    if(jaTrabalhou.equals("S")) quantidadeSim += 1

    if (quantidadeSim == 2){
        println("Suspeita")
    } else if(quantidadeSim == 3 || quantidadeSim == 4){
        println("Cúmplice")
    } else if(quantidadeSim == 5){
        println("Assassino")
    } else{
        println("Inocente")
    }
}