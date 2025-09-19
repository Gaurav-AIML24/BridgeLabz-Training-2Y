import java.util.ArrayList;

public class Assisted_Problem1 {

    static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    '}';
        }
    }

    static class Library {
        private String name;
        private ArrayList<Book> books;

        public Library(String name) {
            this.name = name;
            this.books = new ArrayList<>();
        }

        public void addBook(Book book) {
            books.add(book);
        }

        public void showBooks() {
            System.out.println("Books in " + name + ":");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        // Create books independently
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Create libraries
        Library library1 = new Library("Central Library");
        Library library2 = new Library("Community Library");

        // Add books to libraries (aggregation)
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2);
        library2.addBook(book3);

        // Show books in each library
        library1.showBooks();
        library2.showBooks();

        // Demonstrate that books exist independently
        System.out.println("Book exists independently: " + book1);
    }
}
