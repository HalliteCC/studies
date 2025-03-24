package Classes

fun main() {

    var smartDevice: SmartDevice = SmartTvDevice("Android TV", "Entertainement")
    smartDevice.turnOn()
    smartDevice
}

open class SmartDevice(var name: String, var category: String) {

    var deviceStatus = "ON"

    constructor(name: String, category: String, statusCode: Int): this(name, category){
        deviceStatus = when(statusCode){
            0 -> "OF"
            1 -> "ON"
            else -> "unknown"
        }
    }

    open fun turnOn(){
        deviceStatus = "ON"
        println("THE DEVICE IS ON")
    }

    open fun turnOff(){
        deviceStatus = "OFF"
        println("SHUTTING DOWN THE DEVICE")
    }
}

class SmartTvDevice(deviceName: String, deviceCategory: String) : SmartDevice(deviceName, deviceCategory) {

    var speakerVolume = 2
        set(value) {
            if (value in 1..100) {
                field = value
            }
        }

    var channelNumber = 1
        set(value) {
            if (value in 1..200) {
                field = value
            }
        }

    fun increaseSpeakerVolume(){
        speakerVolume++
        println("SPEAKER VOLUME INCREASE TO $speakerVolume")
    }

    fun nextChannel(){
        channelNumber++
        println("SPEAKER VOLUME INCREASE TO $channelNumber")
    }

    override fun turnOn(){
        super.turnOn()
        println("$name is turned $deviceStatus. Speaker volume is set to $speakerVolume. And the channel number is $channelNumber")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String) : SmartDevice(deviceName, deviceCategory) {
    var brightnessLevel = 0
        set(value){
            if (value in 1..100){
                field = value
            }
        }
    fun increaseBrightness(){
        brightnessLevel++
        println("BRIGHTNESS INCREASED TO ${brightnessLevel}")
    }
}

class SmartHome(val smartTvDevice: SmartTvDevice, val smartLightDevice: SmartLightDevice){

    fun turnOnSmartTv(){
        smartTvDevice.turnOn()
    }

    fun turnOffSmartTv(){
        smartTvDevice.turnOff()
    }

}