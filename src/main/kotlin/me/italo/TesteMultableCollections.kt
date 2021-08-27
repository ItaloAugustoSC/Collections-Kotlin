package me.italo

fun main(){
    val joao = Employee("Joao", 2000.0, "PF")
    val maria = Employee("Maria", 1500.0, "PF")
    val jose = Employee("Jose", 4000.0, "PJ")

    val employees = mutableListOf(joao, maria)
    employees.forEach { println(it) }

    println("------ LIST --------")

    employees.add(jose)
    employees.forEach { println(it) }

    println("--------------")

    employees.remove(joao)
    employees.forEach { println(it) }

    println("------ SET --------")
    val employeesSet = mutableSetOf(joao, maria)
    employeesSet.forEach { println(it) }

    println("--------------")
    employeesSet.add(jose)
    employeesSet.remove(maria)
    employeesSet.forEach { println(it) }
}