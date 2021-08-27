package me.italo

fun main(){
    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach{(key, value) ->
        println("Key: $key - Value: $value")
    }

    val map2 = mapOf("Pedro" to 2500.0, "Maria" to 3000.0)

    map2.forEach{(key, value) ->
        println("Key: $key - Value: $value")
    }
}