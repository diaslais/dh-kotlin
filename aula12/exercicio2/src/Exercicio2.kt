fun main(){
    val numeros = mutableListOf<Int>()

    numeros.add(1)
    numeros.add(5)
    numeros.add(5)
    numeros.add(6)
    numeros.add(7)
    numeros.add(8)
    numeros.add(8)
    numeros.add(8)

    println(numeros)

    val numeros2 = mutableSetOf<Int>()

    numeros2.add(1)
    numeros2.add(5)
    numeros2.add(5)
    numeros2.add(6)
    numeros2.add(7)
    numeros2.add(8)
    numeros2.add(8)
    numeros2.add(8)

    println(numeros2)

    numeros.forEach{
        print(it)
    }

    println("")

    numeros2.forEach{
        print(it)
    }
}