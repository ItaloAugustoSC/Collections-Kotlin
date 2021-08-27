package me.italo

fun main(){
    val values = intArrayOf(1, 2, 3, 4, 5, 10, 8)

    values.forEach { value ->
        println(value)
    }
    println("-------------------")


    values.sort()
    values.forEach { value ->
        println(value)
    }


}