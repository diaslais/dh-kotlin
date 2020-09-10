fun main () {
    print("Quanto você ganha por hora: ")
    val valorHora = readLine()!!.toDouble()

    print("Quantas horas trabalha no mês: ")
    val horasMes = readLine()!!.toDouble()

    val salarioBruto = valorHora * horasMes
    val ir = 0.11 * salarioBruto
    val inss = 0.08 * salarioBruto
    val sindicato = 0.05 * salarioBruto
    val salarioLiquido = salarioBruto - ir - inss - sindicato

    println("+ Salário Bruto: R$ ${"%.2f".format(salarioBruto)}")
    println("- IR (11%): R$ ${"%.2f".format(ir)}")
    println("- INSS (8%): R$ ${"%.2f".format(inss)}")
    println("- Sindicato (5%): R$ ${"%.2f".format(sindicato)}")
    println("= Salário Líquido: R$ ${"%.2f".format(salarioLiquido)}")
}