package me.italo

fun main(){
    val joao = Employee("Joao", 1000.0)
    val maria = Employee("Maria", 2000.0)
    val jose = Employee("Jose", 4000.0)

    val employees = listOf(joao, maria, jose)
    employees.forEach{ println(it)}

    println("--------------")
    println(employees.find { it.name == "Maria" })

}

data class Employee(val name: String, val salary: Double){
    override fun toString(): String =
        """
            Name:   $name
            Salary: $salary
        """.trimIndent()

}