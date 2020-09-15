class JogadorDeFutebol (var nome: String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int){

    fun fazerGol(){
        this.energia -= 5
        this.alegria += 10
        this.gols++
        println("GOOOOL!")
    }

    fun correr(){
        this.energia -= 10
        println("Cansei")
    }
}