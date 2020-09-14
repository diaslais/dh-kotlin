fun main(){
    val cliente1  = Cliente("José", "Silva")
    val cliente2 = Cliente ("Maria", "Souza")

    var conta1 = Conta (cliente1)
    conta1.numeroConta = 123
    conta1.saldo = 5000.0

    var conta2 = Conta (cliente2)
    conta2.numeroConta = 321
    conta2.saldo = 1000.0

    conta1.deposito(500.0)
    conta2.deposito(20.0)

    conta1.saque(50.0)
    conta2.saque(500.0)
}