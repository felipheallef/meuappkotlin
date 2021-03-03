// (C) 2021 Feliphe Allef

/* Exercício "Proposta de exercício final" do curso "Introdução ao Kotlin"
 * da Digital Innovation One.
 *
 * Calculadora de dois valores dados pelo usuário com validação de valores nulos.
*/

package exercises

const val OP_PLUS = 1
const val OP_MINUS = 2
const val OP_TIMES = 3

fun main() {
    print("Qual operação voçê deseja fazer?\n\n1. Soma\n2. Subtração\n3. Multiplicação\n\nDigite o número da opcão: ")
    val operation = readLine()!!.toInt()

    print("Certo, agora digite um número: ")
    val number1 = readLine()!!.toFloat()

    print("Ótimo, agora mais um número: ")
    val number2 = readLine()!!.toFloat()

    execOperation(number1, number2, operation)
}

fun execOperation(n1:Float?, n2:Float?, operation:Int) {

    if (n1 == null || n2 == null) {
        println("Ops, parece que os dados informados não são válidos.")
    } else {

        when (operation) {
            OP_PLUS -> {
                val result = n1 + n2
                println("Resultado: $result")
            }
            OP_MINUS -> {
                val result = n1 - n2
                println("Resultado: $result")
            }
            OP_TIMES -> {
                val result = n1 * n2
                println("Resultado: $result")
            }
            else -> println("Ops, operação inválida.")
        }

    }
}