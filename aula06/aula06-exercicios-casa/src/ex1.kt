fun maiorNumero(numero1: Int, numero2: Int, numero3: Int): Int {
    var maior: Int
    if(numero1 >= numero2 && numero1 >= numero3){
        maior = numero1
    } else if(numero2 >= numero1 && numero2 >= numero3){
        maior = numero2
    } else{
        maior = numero3
    }
    return maior
}

fun main() {
    println("Informe três números: ")
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    var c = readLine()!!.toInt()

    print("O maior número é: ${maiorNumero(a, b, c)}")
}