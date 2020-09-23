fun main(){
    var animais = arrayListOf<String>()
    animais.add("Pato")
    animais.add("Cachorro")
    animais.add("Gato")

    try {
        println(animais[3])
    } catch (ex: Exception){
        println(ex.printStackTrace())
    }
}