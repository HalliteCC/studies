package Classes

fun main() {
    val funcionarioList: List<Employeer> = listOf(
        Manager("Caie"),
        Manager("Roberto"),
        Seller("John"),
        Seller("Stefani")
    )

    for (emp in funcionarioList){
        when (emp){
            is Manager -> println("${emp.name} ganha: ${emp.SalaryCalculate(30000.00)}")
            is Seller -> println("${emp.name} ganha: ${emp.SalaryCalculate(30000.00)}")
        }
    }
}

abstract class Employeer(val name: String){
    abstract fun SalaryCalculate(sales: Double): Double
}

class Manager(name: String): Employeer(name){
    var salary = 5000.0
    override fun SalaryCalculate(sales: Double):Double {
        return salary
    }
}

class Seller(name: String): Employeer(name){
    val fixedSalary = 2000.0
    override fun SalaryCalculate(sales: Double): Double {
        val comission = sales*0.05
        return comission + fixedSalary
    }
}