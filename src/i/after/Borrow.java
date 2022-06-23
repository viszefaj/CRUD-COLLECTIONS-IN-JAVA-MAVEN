package i.after;

import java.time.LocalDateTime;

public interface Borrow {

    void checkOut(String borrower);
    int getCheckOutDurationInDays();
    String getBorrower();
    void checkIn();
    LocalDateTime getDueDate();
    LocalDateTime getBorrowDate();

}
