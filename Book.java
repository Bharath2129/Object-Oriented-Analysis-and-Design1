package OOAD;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private String genre;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, String ISBN, String genre) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
        this.isAvailable = true; // Assume book is available when added to the library
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter method
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Check out a book
    public void checkout() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book checked out successfully");
        } else {
            System.out.println("Book is not available for checkout");
        }
    }

    // Return a book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned successfully");
        } else {
            System.out.println("Book is already available");
        }
    }

    // Update availability status
    public void updateAvailabilityStatus(boolean available) {
        isAvailable = available;
    }
}

