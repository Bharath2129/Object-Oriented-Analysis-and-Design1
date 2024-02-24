package OOAD;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String id;
    private String name;
    private String contactInfo;
    private List<Book> borrowedBooks;

    // Constructor
    public LibraryMember(String id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Borrow a book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println("Book '" + book.getTitle() + "' borrowed successfully");
    }

    // Return a book
    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            System.out.println("Book '" + book.getTitle() + "' returned successfully");
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not borrowed by this member");
        }
    }

    // View borrowed books
    public void viewBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books currently borrowed");
        } else {
            System.out.println("Borrowed books:");
            for (Book book : borrowedBooks) {
                System.out.println("- " + book.getTitle());
            }
        }
    }
}
