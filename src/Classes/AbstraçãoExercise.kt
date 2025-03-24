package Classes

fun main(){
    val conta = ContaCorrente(2.0)
    conta.sacar(2.0)
}

abstract class ContaBancaria(var saldo: Double) {
    abstract fun depositar(valor: Double)

    abstract fun sacar(valor: Double)
}

class ContaCorrente(saldo: Double) : ContaBancaria(saldo) {

    private var taxaSaque: Double = 2.0

    override fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("O valor depositado é de: R$$valor e o saldo é de: R$$saldo")
        }else {
            println("Valor invalido para depósito")
        }
    }

    override fun sacar(valor: Double) {
        if (valor > 0 && valor + taxaSaque <= saldo) {
            saldo -= valor
            saldo -= taxaSaque
            println("O Valor sacado é de: R$$valor, a taxa é de: R$$taxaSaque e o saldo restante é de: R$$saldo")
        } else {
            println("Saldo insuficiente")
        }
    }
}