fun main(){
    print("Digite o valor do saque: ")
    var saque = readLine()!!.toInt()
    var numeroDeNotas = arrayOf(0, 0, 0, 0, 0)
    var notas = arrayOf(100, 50, 10, 5, 1)
    var i = 0
    if(saque >= 10 && saque <= 600){
        while(saque > 0){
            numeroDeNotas[i] = saque / notas[i]
            saque = saque % notas[i]
            i++
        }
        println("Serão fornecidas:")
        for(i in 0..4){
            print("${numeroDeNotas[i]} notas de ${notas[i]}\n")
        }
    } else{
        println("Este valor não pode ser sacado")
    }
}