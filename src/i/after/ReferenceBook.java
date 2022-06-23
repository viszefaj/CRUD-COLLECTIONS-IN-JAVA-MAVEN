package i.after;

import java.time.LocalDateTime;

public class ReferenceBook extends Book{
    private String author;
    private LocalDateTime borrowDate;
    private String borrower;
    private int checkOutDurationInDays;
    private String libraryId;
    private int pages;
    private String title;

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void setBorrowDate(LocalDateTime borrowDate) {
        this.borrowDate = borrowDate;
    }

    @Override
    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    @Override
    public void setCheckOutDurationInDays(int checkOutDurationInDays) {
        this.checkOutDurationInDays = checkOutDurationInDays;
    }

    @Override
    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    @Override
    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    @Override
    public String getBorrower() {
        return borrower;
    }

    @Override
    public int getCheckOutDurationInDays() {
        return 0;
    }

    @Override
    public String getLibraryId() {
        return libraryId;
    }

    @Override
    public int getPages() {
        return pages;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void checkIn() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void checkOut(String borrower) {
        throw new UnsupportedOperationException();
    }

    @Override
    public LocalDateTime getDueDate() {
        throw new UnsupportedOperationException();
    }
}
