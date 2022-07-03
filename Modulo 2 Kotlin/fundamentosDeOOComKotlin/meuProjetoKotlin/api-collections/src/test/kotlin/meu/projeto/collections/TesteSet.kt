package meu.projeto.collections

fun main() {
    val joao = Funcionario("Joao", 5000.0, "CLT")
    val carla = Funcionario("Carla", 3000.0, "CLT")
    val pedro = Funcionario("Pedro", 9000.0, "PJ")

    val funcionarios1 = setOf(joao, carla)
    val funcionarios2 = setOf(pedro)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("--------------------------------")

    val funcionarios3 = setOf(joao, carla, pedro)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("--------------------------------")

    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }

}