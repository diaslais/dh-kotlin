fun main() {
    print("Digite uma letra: ")
    var letra = readLine()!!.toUpperCase()

    if(letra.equals("F")){
        println("Feminino")
    } else if(letra.equals("M")){
        println("Masculino")
    } else{
        println("Sexo inválido")
    }
}