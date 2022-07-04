package meu.projeto.collections

fun main() {
    val joao = Funcionario("Joao", 5000.0, "CLT")
    val carla = Funcionario("Carla", 3000.0, "CLT")
    val pedro = Funcionario("Pedro", 9000.0, "PJ")

    val funcionarios = mutableListOf(joao, pedro)
    funcionarios.forEach{ println(it) }

    println("----------------LIST--------------------")
    funcionarios.add(carla)
    funcionarios.forEach{ println(it) }

    println("---------------------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it) }

    println("----------------SET----------------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("---------------------------------------")

    funcionarioSet.add(pedro)
    funcionarioSet.add(carla)
    funcionarioSet.forEach { println(it) }

    println("---------------------------------------")
    funcionarioSet.remove(carla)
    funcionarioSet.forEach { println(it) }

}