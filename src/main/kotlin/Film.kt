
import com.beust.klaxon.Json

class Film {

    @Json("film_id")
    var filmId = 0

    @Json("title")
    var title: String? = null

    @Json("description")
    var description: String? = null

    @Json("release_year")
    var releaseYear = 0

    @Json("language_id")
    var languageId = 0

    @Json("original_language_id")
    var originalLanguageId = 0

    @Json("length")
    var length = 0

    @Json("last_updated")
    var lastUpdated: String? = null

    @Json("time_added")
    var timeAdded: String? = null

}