const val PERGUNTA = "Qual o melhor Sistema Operacional para uso em servidores?\nAs possíveis respostas são:\n1- Windows Server\n2- Unix\n3- Linux\n4- Netware\n5- Mac OS\n6- Outro"

fun main(){
    var contadores = arrayOf(0, 0, 0, 0, 0, 0)
    var opcoes = arrayOf("Windows Server", "Unix", "Linux", "Netware", "Mac OS", "Outro")
    var totalVotos = 0

    print("$PERGUNTA\n")
    var numeroSO = readLine()!!.toInt()
    while(numeroSO != 0){
        if (numeroSO < 0 || numeroSO > 6){
            "Opção inválida"
        } else{
            contadores[numeroSO - 1]++
            totalVotos++
        }
        print("$PERGUNTA\n")
        numeroSO = readLine()!!.toInt()
    }

    var maisVotado = opcoes[contadores.indexOf(contadores.max()!!)]
    var porcentagemMaisVotado = (contadores.max()!! * 100)/totalVotos

    var porcentagemWindows = (contadores[0] * 100)/totalVotos
    var porcentagemUnix = (contadores[1] * 100)/totalVotos
    var porcentagemLinux = (contadores[2] * 100)/totalVotos
    var porcentagemNetware = (contadores[3] * 100)/totalVotos
    var porcentagemMac = (contadores[4] * 100)/totalVotos
    var porcentagemOutro = ((contadores[5] * 100)/totalVotos)

    //Saída
    println("Sistema Operacional:     Votos:     % ")
    println("-------------------      -----     ---")
    println("Windows Server             ${contadores[0]}       $porcentagemWindows")
    println("Unix                       ${contadores[1]}       $porcentagemUnix")
    println("Linux                      ${contadores[2]}       $porcentagemLinux")
    println("Netware                    ${contadores[3]}       $porcentagemNetware")
    println("Mac OS                     ${contadores[4]}       $porcentagemMac")
    println("Outro                      ${contadores[5]}       $porcentagemOutro")
    println("-------------------      -----")
    println("Total:                     $totalVotos")
    println("O Sistema Operacional mais votado foi o $maisVotado, com ${contadores.max()!!} votos, correspondendo a um total de ${porcentagemMaisVotado}% dos votos.")

}
