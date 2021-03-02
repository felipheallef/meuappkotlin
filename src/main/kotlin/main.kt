// (C) 2021 Feliphe Allef
import com.beust.klaxon.Klaxon

fun main() {

    class Data(val films: List<Film>)
    val content = Test.getFromUrl("http://localhost:9000/catalog/films/all")
    val result = Klaxon().parse<Data>(content)

    for (film in result!!.films) {
        println(film.title)
    }
}