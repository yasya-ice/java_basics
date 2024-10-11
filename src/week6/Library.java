package week6;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }

    public void printBooks() {
        for (Book book : this.books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {

        Library library = new Library();

        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        library.addBook(cheese);

        Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
        library.addBook(nhl);

        library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        library.printBooks();
    }
}
