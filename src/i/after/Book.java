package i.after;

import java.time.LocalDateTime;

public class Book implements LibraryItem,Borrow{

    private String author;
     private LocalDateTime borrowDate;
    private String borrower;
    private int checkOutDurationInDays;
    private String libraryId;
    private int pages;
    private String title;

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

    public String getAuthor() {
        return author;
    }

    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    public String getBorrower() {
        return borrower;
    }

    public int getCheckOutDurationInDays() {
        return checkOutDurationInDays;
    }


    public String getLibraryId() {
        return libraryId;
    }

    public int getPages() {
        return pages;
    }


    public String getTitle() {
        return title;
    }


    public void checkIn() {
        borrower = "";
    }


    public void checkOut(String borrower) {
        this.borrower = borrower;
        borrowDate = LocalDateTime.now();
    }

    public LocalDateTime getDueDate() {
        return borrowDate.plusDays(checkOutDurationInDays);
    }


}
