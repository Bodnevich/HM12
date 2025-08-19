//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Стивен", "Кинг");
        Author author1 = new Author("Чак", "Паланик");
        Book book = new Book("Спящие красавицы", 2022, author);
        Book book1 = new Book("Снафф", 1999, author1);
        System.out.println("Название книги - " + book.getName() + ", год публикации: " + book.getYearOfPublication() + ", автор: " + author.getFirstName() + " " + author.getLastName());
        System.out.println("Название книги - " + book1.getName() + ", год публикации: " + book1.getYearOfPublication() + ", автор: " + author1.getFirstName() + " " + author1.getLastName());
    }
}