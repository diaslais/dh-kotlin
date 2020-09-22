import com.sun.org.apache.xpath.internal.operations.Bool

class Aluno (
    val registro: String,
    val nome: String,
    val sobrenome: String
){
    val assistirAula get() = true
    val fazerLicao get() = true
}