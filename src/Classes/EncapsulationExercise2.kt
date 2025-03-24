package Classes

fun main() {
 val conta = BankAccount(600.0, "Caie")
    conta.deposit(700.0)
    conta.showBalance()
    conta.withdraw(350.0)
    conta.showBalance()
}

open class BankAccount(private var balance: Double, private val holder: String) {
    open fun deposit(valor: Double) {
        if (valor > 0) {
            balance += valor
            println("O valor: R$$valor foi depositado. O saldo atual é de: R$$balance")
        }else {
            println("Valor invalido para depósito")
        }
    }

    open fun withdraw(valor: Double){
        if(valor > 0 && valor <= balance ){
            balance -= valor
            println("O valor sacado é de: R$$valor e o saldo atual é de: R$$balance")
        }else if(valor > balance){
            println("Saldo insuficiente")
        }else {
            println("Valor para saca inválido")
        }
    }

    fun showBalance(){
        println("Saldo do $holder é de:R$$balance")
    }
}


