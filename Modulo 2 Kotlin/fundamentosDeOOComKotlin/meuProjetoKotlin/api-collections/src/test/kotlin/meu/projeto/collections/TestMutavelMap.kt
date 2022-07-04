package meu.projeto.collections

fun main() {
    val joao = Funcionario("Joao", 5000.0, "CLT")
    val carla = Funcionario("Carla", 3000.0, "CLT")
    val pedro = Funcionario("Pedro", 9000.0, "PJ")


    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(carla.nome, carla)
    repositorio.create(pedro.nome, pedro)

    println(repositorio.findById(joao.nome))

    println("------------------------")
    repositorio.findAll().forEach { println(it) }

    println("------------------------")
    repositorio.remove(pedro.nome)
    repositorio.findAll().forEach { println(it) }
}