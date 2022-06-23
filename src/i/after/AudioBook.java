package i.after;

import java.time.LocalDateTime;

public class AudioBook implements Borrow,LibraryItem{
    private String author;
    private LocalDateTime borrowDate;
    private String borrower;
    private int checkOutDurationInDays;
    private String libraryId;
    private int pages;
    private String title;
    private int runtimeInMinutes;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBorrowDate(LocalDateTime borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public void setCheckOutDurationInDays(int checkOutDurationInDays) {
        this.checkOutDurationInDays = checkOutDurationInDays;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRuntimeInMinutes(int runtimeInMinutes) {
        this.runtimeInMinutes = runtimeInMinutes;
    }

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
        return checkOutDurationInDays;
    }

    @Override
    public String getLibraryId() {
        return libraryId;
    }

    public int getPages() {
        return -1;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void checkIn() {
        borrower = "";
    }

    @Override
    public void checkOut(String borrower) {
        this.borrower = borrower;
        borrowDate = LocalDateTime.now();
    }

    @Override
    public LocalDateTime getDueDate() {
        return borrowDate.plusDays(checkOutDurationInDays);
    }

    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

}
