fun saoDiferentes(str1: String, str2: String): Boolean{
    if(str1 != str2){
        return true
    }
    return false
}

fun main(){
    println("Digite duas strings: ")
    var string1 = readLine()!!
    var string2 = readLine()!!

    println(saoDiferentes(string1, string2))
}