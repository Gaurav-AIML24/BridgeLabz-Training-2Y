public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    // Default constructor
    public LibraryBook() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.availability = true;
    }

    // Parameterized constructor
    public LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Borrow method
    public void borrow() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }
}
