// (C) 2021 Feliphe Allef

/* Generates a random grade number
 * and then finds out either the student is
 * approved or not.
 */

fun main() {
    val grade = (0..10).random()
    println(grade.getStatus())
}

fun Int.getStatus():String {
    println("Nota: $this")
    return when(this) {
        in 0..4 -> "Reprovado"
        in 5..7 -> "Bom"
        in 8..9 -> "Ótimo!"
        10 -> "Excelente!"
        else -> "Indefinido"
    }
}