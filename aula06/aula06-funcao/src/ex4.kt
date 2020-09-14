import kotlin.random.Random

fun lancaDados() = Random.nextInt(1, 6) + Random.nextInt(1, 6)

fun ganhou(numero: Int) = println("Você tirou $numero! Parabéns você ganhou!")
fun perdeu(numero: Int) = println("Você tirou $numero! Você perdeu =(")
fun fezPonto(numero: Int){
    println("Você tirou $numero! Aperte enter para tentar novamente")
    var entrada = readLine()!!
}
fun tirarOutro(numero: Int) = println("Você tirou $numero")
fun naoJogou() = println("Jogada não realizada: fim de jogo.")

fun recebeJogada(): Int{
    print("Rolar dados? (s ou n) ")
    var jogada = readLine()!!.toLowerCase()
    if(jogada.equals("s")){
        return lancaDados()
    }
    return 0
}

fun main() {
    var ponto: Int
    var jogada = recebeJogada()
    if(jogada != 0) {
        if (jogada == 7 || jogada == 11) {
            ganhou(jogada)
        } else if (jogada == 2 || jogada == 3 || jogada == 12) {
            perdeu(jogada)
        } else {
            ponto = jogada
            fezPonto(jogada)
            var jogoAcabou = false
            while(!jogoAcabou){
                jogada = recebeJogada()
                if (jogada != 0) {
                    if (jogada == ponto) {
                        ganhou(jogada)
                        jogoAcabou = true
                    } else if (jogada == 7) {
                        perdeu(jogada)
                        jogoAcabou = true
                    } else {
                        tirarOutro(jogada)
                    }
                } else {
                    naoJogou()
                    jogoAcabou = true
                }
            } //while(!jogoAcabou)
        } //else
    }else {
        naoJogou()
    }
}