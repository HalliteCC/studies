package Classes

fun main() {
    val veiculos: List<Veiculo> = listOf(Trem(), Bike())

    for (veiculo in veiculos){
        veiculo.mover()
    }
}

abstract class Veiculo {
    abstract fun mover()
}

class Bike : Veiculo() {
    override fun mover() {
        println("A bicicleta está se movendo")
    }
}

class Trem : Veiculo() {
    override fun mover() {
        println("O trem está se movendo")
    }
}
