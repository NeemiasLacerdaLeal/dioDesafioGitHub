package meuProjeto

class Pessoa {
    var nome: String = "Neemias"
    var cpf: String = "123.123.123-11"
}

fun main() {
    val neemias = Pessoa ()

    println(neemias.nome)
    println(neemias.cpf)
}