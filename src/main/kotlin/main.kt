// (C) 2021 Feliphe Allef

fun main() {
    print("Digite o nome do filme: ")
    val name = readLine()
    print("Digite o ano de lançamento do filme: ")
    val year = readLine()!!.toInt()
    val film = Film(name)
    film.releaseYear = year

    println(film.filmName + " foi lançado em " + film.releaseYear)

    if (year > 2020)
        println("Ainda será lançado, de fato.")
}