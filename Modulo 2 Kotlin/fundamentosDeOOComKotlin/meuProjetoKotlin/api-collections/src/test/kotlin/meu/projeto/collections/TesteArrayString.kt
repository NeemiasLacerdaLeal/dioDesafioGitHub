package meu.projeto.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "maria"
    nomes[1] = "jose"
    nomes[2] = "paulo"

    for (nome in nomes){
        println(nome)
    }
    println("-------------------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("-------------------------------")
    val nomes2 = arrayOf("maria", "paulo", "jose")
    nomes2.sort()
    nomes.forEach { println(it) }

}