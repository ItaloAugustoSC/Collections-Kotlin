package me.italo

fun main(){
    val names = Array(6){""}
    names[0] = "Italo"
    names[1] = "Joao"
    names[2] = "Maria"
    names[3] = "Jose"
    names[4] = "Mariana"
    names[5] = "Marcia"

    for (name in names){
        println(name)
    }
    println("---------------")

    names.sort()
    names.forEach { name ->
        println(name)
    }

    val names2 = arrayOf("Italo", "Joao", "Maria", "Jose")
    println("---------------")

    names2.sort()
    names2.forEach { name ->
        println(name)
    }

}