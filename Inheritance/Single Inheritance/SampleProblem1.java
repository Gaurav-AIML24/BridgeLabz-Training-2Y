// Superclass Book
class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

// Subclass Author (inherits from Book)
class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // call superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Method to display book and author info
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class to test
public class SampleProblem1 {
    public static void main(String[] args) {
        Author author = new Author(
            "The Java Handbook",
            2023,
            "James Gosling",
            "Father of Java Programming Language"
        );

        author.displayInfo();
    }
}