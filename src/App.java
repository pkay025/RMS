public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Library library = new Library();

        Book book1 = new Book("Harry Porter", "J. K. Rowling", "978023445");
        Book book2 = new Book("CashFlow Quadrant", "Robert Kiyosaki", "987654321");
        library.addBook(book1);
        library.addBook(book2);


        Patron patron1 = new Patron("Daffodil", "P001");
        Patron patron2 = new Patron("Paakow", "P002");
        library.registerPatron(patron1);
        library.registerPatron(patron2);


        library.listAvailableBooks();

        library.borrowBook("978023445", "P001");

        library.listAvailableBooks();

        library.returnBook("978023445");

        library.listAvailableBooks();
    }
}
}
