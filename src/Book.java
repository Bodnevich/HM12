public class Book {
    private String name;
    private int yearOfPublication;
    private Author author;

    public Book(String name, int yearOfPublication, Author author) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getName () {
        return this.name;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public Author getAuthor() {
        return this.author;
    }

}
