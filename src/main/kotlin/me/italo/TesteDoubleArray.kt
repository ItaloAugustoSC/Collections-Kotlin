package me.italo

fun main(){
    val salary = DoubleArray(3)
    salary[0] = 1000.0
    salary[1] = 3000.0
    salary[2] = 999.0

    salary.forEach { println(it) }
    println("-------------")

    salary.forEachIndexed() { index, salario ->
        salary[index] = salario * 1.1
    }
    salary.forEach { println(it) }
    println("-------------")

    val salary2 = doubleArrayOf(1000.0, 3000.0, 999.0)
    salary2.sort()
    salary2.forEach { println(it) }
}