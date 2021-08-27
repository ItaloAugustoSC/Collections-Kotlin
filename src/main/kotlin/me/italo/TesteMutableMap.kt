package me.italo

fun main(){
    val joao = Employee("Joao", 2000.0, "PF")
    val maria = Employee("Maria", 1500.0, "PF")
    val jose = Employee("Jose", 4000.0, "PJ")

    val repository = Repository<Employee>()

    repository.create(joao.name, joao)
    repository.create(maria.name, maria)
    repository.create(jose.name, jose)

    println(repository.findById(joao.name))
    println("------------")

    repository.findAll().forEach{ println(it)}

    println("------------")
    repository.remove(maria.name)
    repository.findAll().forEach{ println(it)}
}