import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerPatron(Patron patron) {
        patrons.add(patron);
    }

    public boolean borrowBook(String isbn, String patronId) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println(patronId + " borrowed " + book.getTitle());
                return true;
            }
        }
        System.out.println("Book not available or does not exist.");
        return false;
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.setAvailable(true);
                System.out.println(book.getTitle() + " has been returned.");
                return;
            }
        }
        System.out.println("Book does not exist.");
    }

    public void listAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}

