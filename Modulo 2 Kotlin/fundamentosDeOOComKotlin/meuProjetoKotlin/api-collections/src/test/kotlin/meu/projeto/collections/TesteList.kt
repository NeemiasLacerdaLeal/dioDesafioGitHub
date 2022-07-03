package meu.projeto.collections

fun main() {
    val joao = Funcionario("Joao", 5000.0, "CLT")
    val carla = Funcionario("Carla", 3000.0,"CLT")
    val pedro = Funcionario("Pedro", 9000.0, "PJ")

    val funcionarios = listOf(joao, carla, pedro)

    funcionarios.forEach{ println(it) }

    println("-------------------------------")
    println(funcionarios.find { it.nome == "Pedro"})

    println("-------------------------------")
    funcionarios.sortedBy { it.salario }
                .forEach { println(it) }
    println("-------------------------------")
    println(funcionarios.find { it.nome == "Pedro"})

    println("-------------------------------")
    funcionarios.groupBy { it.tipoContratacao }
        .forEach { println(it) }

}

