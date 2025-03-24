package Classes

data class Colaborator(val name: String, var salary: Int)




fun main() {
    val emp = Colaborator("Mary", 20)
    println(emp)
    emp.salary += 300
    println(emp)
}