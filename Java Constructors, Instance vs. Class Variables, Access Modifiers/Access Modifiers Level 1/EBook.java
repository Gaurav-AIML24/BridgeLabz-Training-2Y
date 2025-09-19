public class EBook extends Book {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void display() {
        // Accessing public member
        System.out.println("ISBN: " + ISBN);
        // Accessing protected member
        System.out.println("Title: " + title);
        // Cannot access private member author directly here
        System.out.println("Author (accessed via getter): " + getAuthor());
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("1234567890", "Java Programming", "John Doe");
        ebook.display();
    }
}
