package Classes

fun main(){
  val car = Carro("Reneut", "Sandero")
    car.details()
    car.acelerar(50)
}

open class Vehicle (val label: String, val model: String){
    open fun details(){}
}

class Carro(label: String, model: String) : Vehicle(label, model){
    private var numDoors: Int = 4

    override fun details(){
        println("This is a $model from $label and it has $numDoors doors")
    }

    fun acelerar(valor: Int){
        if (valor != 0){
            println("O carro está acelerando")
        }
    }
}