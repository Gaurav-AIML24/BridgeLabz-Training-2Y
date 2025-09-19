// Interface for Reservable items
interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

// Abstract Class LibraryItem
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isReserved;

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false; // Initially available
    }

    // Encapsulation - Getters & Setters
    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isReserved() { return isReserved; }
    public void setReserved(boolean reserved) { this.isReserved = reserved; }

    // Concrete Method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId + 
                           ", Title: " + title + 
                           ", Author: " + author + 
                           ", Reserved: " + isReserved);
    }

    // Abstract Method
    public abstract int getLoanDuration(); // in days
}

// Book Class
class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isReserved()) {
            setReserved(true);
            System.out.println("Book reserved by " + borrower);
        } else {
            System.out.println("Book already reserved!");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Magazine Class
class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isReserved()) {
            setReserved(true);
            System.out.println("Magazine reserved by " + borrower);
        } else {
            System.out.println("Magazine already reserved!");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// DVD Class
class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isReserved()) {
            setReserved(true);
            System.out.println("DVD reserved by " + borrower);
        } else {
            System.out.println("DVD already reserved!");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Main Class
public class LibrarySystemDemo {
    public static void main(String[] args) {
        // Polymorphism: Array of LibraryItems
        LibraryItem[] items = new LibraryItem[] {
            new Book("B101", "Java Basics", "James Gosling"),
            new Magazine("M202", "Tech Monthly", "John Smith"),
            new DVD("D303", "Inception", "Christopher Nolan")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available? " + r.checkAvailability());
                r.reserveItem("Alice");
                System.out.println("Available after reservation? " + r.checkAvailability());
            }

            System.out.println("----------------------------------");
        }
    }
}