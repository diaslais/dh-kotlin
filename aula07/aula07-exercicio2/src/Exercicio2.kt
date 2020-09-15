fun main(){
    var jogador1 = JogadorDeFutebol("Joao", 10, 5, 3, 6)
    var jogador2 = JogadorDeFutebol("Mario", 5, 8, 4, 5)

    var treino1 = SessaoDeTreinamento(5)
    treino1.treinarA(jogador1)

    var treino2 = SessaoDeTreinamento(10)
    treino2.treinarA(jogador2)
}