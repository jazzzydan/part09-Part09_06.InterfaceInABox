public class Book implements Packable{
    private String author;
    private String nameOfTheBook;
    private double weight;

    public Book(String author, String nameOfTheBook, double weight) {
        this.author = author;
        this.nameOfTheBook = nameOfTheBook;
        this.weight = weight;
    }

    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.nameOfTheBook;
    }
}
