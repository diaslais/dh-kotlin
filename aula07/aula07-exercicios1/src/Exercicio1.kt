fun main(){
    var cliente1  = Cliente("José", "Silva")
    var cliente2 = Cliente ("Maria", "Souza")

    var conta1 = Conta (cliente1, 123, 5000.0)

    var conta2 = Conta (cliente2, 321, 1000.0)

    conta1.deposito(500.0)
    conta2.deposito(20.0)

    conta1.saque(50.0)
    conta2.saque(500.0)
}