package i.after;

import java.time.LocalDateTime;
import java.util.List;

public class DVD implements LibraryItem,Borrow {
    private String author;
    private LocalDateTime borrowDate;
    private String borrower;
    private int checkOutDurationInDays;
    private String libraryId;
    private int pages;
    private String title;

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public void setRuntimeInMinutes(int runtimeInMinutes) {
        this.runtimeInMinutes = runtimeInMinutes;
    }

    private List<String> actors;
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

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return "";
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
        return 14;
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

    public List<String> getActors() {
        return actors;
    }

    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

}
