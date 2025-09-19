public class Book {
    private static String libraryName = "City Library";

    private final String isbn;
    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell", "9780451524935");
        if (book instanceof Book) {
            book.displayDetails();
        } else {
            System.out.println("Object is not an instance of Book");
        }
        Book.displayLibraryName();
    }
}
