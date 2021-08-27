package me.italo

fun main(){
    val values = IntArray(5)

    values[0] = 1
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 5

    //3 formas de iterar
    for(value in values){
        println(value)
    }

    values.forEach { value ->
        println(value)
    }

    for(index in values.indices){
        println(values[index])
    }
}