fun main(){
    var listaDeFuncionarios = arrayListOf<Funcionario>()

    listaDeFuncionarios.add(Funcionario("Maria", 111))
    listaDeFuncionarios.add(Funcionario("Marilia", 222))
    listaDeFuncionarios.add(Funcionario("Mariana", 333))
    listaDeFuncionarios.add(Funcionario("Marcia", 444))

    val funcionario = Funcionario("Ana", 222)

    println(listaDeFuncionarios.contains(funcionario))
}