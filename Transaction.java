package OOAD;

import java.time.LocalDateTime;

public class Transaction {
    private Book book;
    private LibraryMember member;
    private LocalDateTime dateTime;
    private TransactionType type;

    public Transaction(Book book, LibraryMember member, TransactionType type) {
        this.book = book;
        this.member = member;
        this.dateTime = LocalDateTime.now();
        this.type = type;
    }

    public Book getBook() {
        return book;
    }

    public LibraryMember getMember() {
        return member;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public TransactionType getType() {
        return type;
    }
}

enum TransactionType {
    BORROW,
    RETURN
}

