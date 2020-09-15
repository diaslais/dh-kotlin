class Prova (var dificuldade: Int, var energiaNecessaria: Int){

    fun realizarProva(atleta: Atleta): Boolean{
        var pode = (atleta.nivel >= this.dificuldade && atleta.energia >= this.energiaNecessaria)
        if(pode) atleta.energia -= this.energiaNecessaria
        return pode
    }
}