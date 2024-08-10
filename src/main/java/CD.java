public class CD implements Packable{
    private String artist;
    private String nameOfTheCD;
    private int publicationYear;
    private double weight;

    public CD(String artist, String nameOfTheCD, int publicationYear) {
        this.artist = artist;
        this.nameOfTheCD = nameOfTheCD;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    public double weight() {
        return this.weight;
    }

    public String toString() {
        return this.artist + ": " + this.nameOfTheCD + " (" + this.publicationYear + ")";
    }

}
