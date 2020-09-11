fun main(){
    do {
        print("Nome: ")
        var nome = readLine()!!
        if(nome.length > 3){
            break
        }
        println("O nome deve ter mais que 3 caracteres")
    } while (true)

    do {
        print("Idade: ")
        var idade = readLine()!!.toInt()
        if(idade in 0..150){
            break
        }
        println("A idade deve ser entre 0 e 150")
    } while (true)

    do {
        print("Salário: ")
        var salario = readLine()!!.toDouble()
        if(salario > 0){
            break
        }
        println("O salário deve ser maior que 0")
    } while (true)

    do {
        print("Sexo: ")
        var sexo = readLine()!!.toUpperCase()
        if(sexo.equals("F") || sexo.equals("M")){
            break
        }
        println("O sexo deve estar definido com 'f' ou 'm'")
    } while (true)

    do {
        print("Estado Civil: ")
        var estadoCivil = readLine()!!.toUpperCase()
        if(estadoCivil.equals("S") || estadoCivil.equals("C") || estadoCivil.equals("V") || estadoCivil.equals("D")){
            break
        }
        println("O estado civil deve ser definido como 's', 'c', 'v' ou 'd'")
    } while (true)
}