package Classes

fun main() {
    var car = Car()
    car.ligar()
    car.acelerar(20)
    car.acelerar(50)
    car.frear(30)
    car.desligar()
    car.mostrarEstado()

}


private class Car(private var velocidadeAtual: Int = 0, private var state: Boolean = false) {


    fun ligar() {
        if (state == false) {
            state = true
            println("O carro está ligado")
        }
    }

    fun desligar() {
        if (state == true) {
            state = false
            velocidadeAtual = 0
        }
    }

    fun acelerar(valor: Int) {
        if (state == true) {
            velocidadeAtual += valor
            println("O carro aumentou sua velocidade em: ${valor}km/h")
        } else {
            println("Ligar o carro primeiro")
        }
    }


    fun frear(valor: Int) {
        if (valor > 0) {
            velocidadeAtual -= valor
            if(velocidadeAtual < 0) velocidadeAtual = 0
            println("O carro reduziu para ${velocidadeAtual}km/h")
        }else {
            println("Valor de frenagem invalido")
        }
    }

    fun mostrarEstado() {
        val estado = when (state){
            true -> "Ligado"
            false -> "Desligado"
        }
        println("O carro está: $estado e sua velocidade é de ${velocidadeAtual}km/h")
    }
}