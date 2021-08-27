package me.italo

fun main(){
    val salarys = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for(salary in salarys) {
        println(salary)
    }
    println("-------------")
    println("Max salary: ${salarys.maxOrNull()}")
    println("Min salary: ${salarys.minOrNull()}")
    println("Average salary: ${salarys.average()}")

    println("-------------")
    val salaryMoreThan2500 = salarys.filter { value ->
        value > 2500.0
    }
    salaryMoreThan2500.forEach { println(it)}

    println("-------------")
    println(salarys.count(){it in 2000.0..5000.0}) //shows the amount of numbers in the range

    println("-------------")
    println(salarys.find { it == 2250.0 })

    println("-------------")
    println(salarys.any { it == 2250.0 })
}