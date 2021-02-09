// (C) 2021 Feliphe Allef

public class Film {

    private String filmName;
    private int releaseYear;

    public Film(String name) {
        this.filmName = name;
    }

    public String getFilmName() {
        return this.filmName;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
