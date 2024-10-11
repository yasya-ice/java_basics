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

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : this.books) {
            if (book.title().toLowerCase().contains(title.toLowerCase())) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : this.books) {
            if (book.publisher().toLowerCase().contains(publisher.toLowerCase())) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : this.books) {
            if (book.year() == year) {
                found.add(book);
            }
        }
        return found;
    }

    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        ArrayList<Book> result = library.searchByTitle("Cheese");
        for (Book book : result) {
            System.out.println(book);
        }

        System.out.println("---");

        for (Book book : library.searchByPublisher("Penguin Group")) {
            System.out.println(book);
        }

        System.out.println("---");

        for (Book book : library.searchByYear(1851)) {
            System.out.println(book);
        }
    }
}
