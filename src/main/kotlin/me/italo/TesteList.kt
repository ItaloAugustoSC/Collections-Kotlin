package me.italo

fun main(){
    val joao = Employee("Joao", 2000.0, "PF")
    val maria = Employee("Maria", 1500.0, "PF")
    val jose = Employee("Jose", 4000.0, "PJ")

    val employees = listOf(joao, maria, jose)
    employees.forEach{ println(it)}

    println("--------------")
    println(employees.find { it.name == "Maria" })

    println("--------------")
    employees.sortedBy { it.salary }.forEach { println(it)}

    println("--------------")
    employees.groupBy { it.type }.forEach{ println(it)}

}

data class Employee(val name: String, val salary: Double, val type: String){
    override fun toString(): String =
        """
            Name:   $name
            Salary: $salary
        """.trimIndent()

}