/**
 * randomly generates someone's age and finds out if they can be a
 * blood donor.
 */

const val MIN_AGE = 16
const val MAX_AGE = 68

fun main() {

    val age = (12..100).random()
    println("Idade: $age")

    if (age in MIN_AGE..MAX_AGE) {
        println("Você pode ser um doador de sangue.")
    } else {
        println("Você não pode ser um doador de sangue pois não se encaixa nos requisitos de idade.")
    }

    // println(age >= MIN_AGE && age <= MAX_AGE)

}
