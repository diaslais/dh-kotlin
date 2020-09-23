fun main(){
    var listaDeAlunos = arrayListOf<Aluno>()

    listaDeAlunos.add(Aluno("Jose", 111))
    listaDeAlunos.add(Aluno("Joao", 222))
    listaDeAlunos.add(Aluno("Joaquim", 333))
    listaDeAlunos.add(Aluno("Juca", 444))

    val aluno = Aluno("Marcio", 111)

    println(listaDeAlunos.contains(aluno))
}