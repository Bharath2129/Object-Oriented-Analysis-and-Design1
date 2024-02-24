package OOAD;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;
    private List<Transaction> transactions;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getTitle() + "' added to the library");
    }

    // Remove a book from the library
    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book '" + book.getTitle() + "' removed from the library");
        } else {
            System.out.println("Book '" + book.getTitle() + "' not found in the library");
        }
    }

    // Add a member to the library
    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Member '" + member.getName() + "' added to the library");
    }

    // Remove a member from the library
    public void removeMember(LibraryMember member) {
        if (members.remove(member)) {
            System.out.println("Member '" + member.getName() + "' removed from the library");
        } else {
            System.out.println("Member '" + member.getName() + "' not found in the library");
        }
    }

    // Process a transaction
    public void processTransaction(Transaction transaction) {
        transactions.add(transaction);
        if (transaction.getType() == TransactionType.BORROW) {
            transaction.getMember().borrowBook(transaction.getBook());
            transaction.getBook().checkout();
        } else {
            transaction.getMember().returnBook(transaction.getBook());
            transaction.getBook().returnBook();
        }
        System.out.println("Transaction processed successfully");
    }
}
