package Classes

import kotlin.random.Random

data class Employee(val name: String, var salary: Int)
class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int){
    val names = listOf("Caie", "Luiz", "Roberto", "Tabata", "Andreia", "Lucas", "John", "Stéfani")
    fun generateEmployee() = Employee(names.random(), Random.nextInt(from = minSalary, until = maxSalary))
}

// Write your code here

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}