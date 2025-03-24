package Classes

fun main(){
    val lampada = Lamp("Lampada")
    lampada.turnOn()
    lampada.turnOff()

    val fitaLed = LedStrip("Fita LED")
    fitaLed.turnOn()
    fitaLed.adjustIntensity(75)  // Ajuste da intensidade
    fitaLed.turnOff()
}


abstract class IluminationDevice(val deviceName: String){
    abstract fun turnOn()

    abstract fun turnOff()
}

class Lamp(name: String): IluminationDevice(name){
    override fun turnOn() {
        println("O dispositivo: $deviceName está ligado")
    }

    override fun turnOff() {
        println("O dispositivo: $deviceName está desligado")
    }
}

class LedStrip(name: String): IluminationDevice(name){

    private var intensity: Int = 0

    override fun turnOn() {
        println("O dispositivo: $deviceName está ligado")
    }

    override fun turnOff() {
        println("O dispositivo: $deviceName está desligado")
    }

    fun adjustIntensity(intensity: Int) {
        if (intensity in 0..100) {
            this.intensity = intensity
            println("Intensidade da $deviceName ajustada para $intensity%")
        } else {
            println("Intensidade inválida. Deve estar entre 0 e 100.")
        }
    }
}