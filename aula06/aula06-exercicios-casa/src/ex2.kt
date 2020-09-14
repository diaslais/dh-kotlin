fun saoDiferentes(str1: String, str2: String) = !str1.equals(str2)

fun main(){
    println("Digite duas strings: ")
    var string1 = readLine()!!
    var string2 = readLine()!!

    println(saoDiferentes(string1, string2))
}