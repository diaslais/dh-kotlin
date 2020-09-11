fun main(){
    print("Digite o valor do saque: ")
    var saque = readLine()!!.toInt()

    var quantidade1: Int
    var quantidade5: Int
    var quantidade10: Int
    var quantidade50: Int
    var quantidade100: Int

    var restante: Int

    if(saque >= 10 && saque <= 600){
        quantidade100 = saque / 100
        restante = saque % 100
        quantidade50 = restante / 50
        restante = restante % 50
        quantidade10 = restante / 10
        restante = restante % 10
        quantidade5 = restante / 5
        restante = restante % 5

        quantidade1 = restante

        println("Serão fornecidas $quantidade100 notas de 100, $quantidade50 notas de 50, $quantidade10 notas de 10, $quantidade5 notas de 5 e $quantidade1 notas de 1")
    } else{
        println("Este valor não pode ser sacado")
    }
}