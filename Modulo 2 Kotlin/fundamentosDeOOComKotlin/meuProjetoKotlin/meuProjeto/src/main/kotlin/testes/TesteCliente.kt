package testes

import meuProjeto.Cliente
import meuProjeto.ClienteTipo

fun main () {
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "12345674877",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}