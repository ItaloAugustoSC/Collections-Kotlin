package me.italo

fun main(){
    val joao = Employee("Joao", 2000.0, "PF")
    val maria = Employee("Maria", 1500.0, "PF")
    val jose = Employee("Jose", 4000.0, "PJ")

    val employees1 = setOf(joao, maria)
    val employees2 = setOf(jose)

    val employeesUnion = employees1.union(employees2)
    employeesUnion.forEach { println(it)}
    println("---------")

    val employees3 = setOf(joao, maria, jose)
    val employeesSubtract = employees3.subtract(employees2)
    employeesSubtract.forEach{ println(it)}
    println("---------")

    val employeesIntersect = employees3.intersect(employees2)
    employeesIntersect.forEach{ println(it)}
}