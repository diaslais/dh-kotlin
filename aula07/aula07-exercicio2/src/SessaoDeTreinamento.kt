class SessaoDeTreinamento (var experiencia: Int){

    fun treinarA (jogador: JogadorDeFutebol){
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        println(jogador.experiencia)
        jogador.experiencia += this.experiencia
        println(jogador.experiencia)
        print("\n")
    }
}