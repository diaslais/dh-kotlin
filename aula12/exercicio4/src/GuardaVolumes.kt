class GuardaVolumes (val dicionario: MutableMap<Int, List<Peca>>, var contador: Int){

    fun guardarPecas(listaDePeca: MutableList<Peca>): Int{
        val contadorAntigo = contador
        dicionario[contador] = listaDePeca
        contador++
        return contadorAntigo
    }

    fun mostrarPecas(){
        println(dicionario)
    }

    fun mostrarPecas(numero: Int){
        println(dicionario[numero])
    }

    fun devolverPecas(numero: Int){
        dicionario.remove(numero)
    }
}