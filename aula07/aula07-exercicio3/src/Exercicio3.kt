fun main(){
    var atleta1 = Atleta("Maria", 9, 15)
    var atleta2 = Atleta("Joao", 7, 6)

    var prova1 = Prova(8, 8)
    var prova2 = Prova(8, 5)
    var prova3 = Prova(5, 5)

    println(prova1.realizarProva(atleta1))
    println(prova1.realizarProva(atleta2))
    print("\n")

    println(prova2.realizarProva(atleta1))
    println(prova2.realizarProva(atleta2))
    print("\n")

    println(prova3.realizarProva(atleta1))
    println(prova3.realizarProva(atleta2))
}