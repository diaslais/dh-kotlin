fun soma(n1: Int, n2: Int, n3: Int) = (n1 + n2 + n3)

fun main(){
    println("Digite os números que deseja somar: ")
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
    var num3 = readLine()!!.toInt()

    print("A soma é: ${soma(num1, num2, num3)}")
}