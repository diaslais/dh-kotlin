import java.util.*

class Curso (
    val nome: String,
    var professorResponsavel: Professor
){
    val listaAulas get() = ArrayList<Aula>()
    val listaAlunos get() = ArrayList<Aluno>()

}