package com.airtribe.librarymgmt.entity;

import com.airtribe.librarymgmt.entity.enums.BookStatus;
import com.airtribe.librarymgmt.entity.enums.LoanStatus;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Objects;

@Getter
public class Loan {
    private final Patron patron;
    private final String LOANID;
    private final BookCopy bookCopy;
    private final LocalDate checkoutDate;
    private  LocalDate returnDate;
    private final LocalDate dueDate;
    private LoanStatus status;

    public Loan(Patron patron, String LOANID, BookCopy bookCopy, LocalDate checkoutDate, LocalDate returnDate, LocalDate dueDate) {
        if (LOANID == null || LOANID.isBlank()) throw new IllegalArgumentException("loanId is required");
        if (patron == null) throw new IllegalArgumentException("patron is required");
        if (bookCopy == null) throw new IllegalArgumentException("bookCopy is required");
        if (checkoutDate == null) throw new IllegalArgumentException("checkoutDate is required");
        if (dueDate == null) throw new IllegalArgumentException("dueDate is required");
        if (dueDate.isBefore(checkoutDate)) throw new IllegalArgumentException("dueDate cannot be before checkoutDate");
        this.patron = patron;
        this.LOANID = LOANID;
        this.bookCopy = bookCopy;
        this.checkoutDate = checkoutDate;
        this.returnDate = returnDate;
        this.dueDate = dueDate;
        this.status = LoanStatus.ACTIVE;
        // When a loan is created, mark the copy as checked out
        bookCopy.setStatus(BookStatus.BORROWED);
        patron.addActiveLoan(this);
    }
    public boolean isOverdue(LocalDate asOf) {
        return status == LoanStatus.ACTIVE && dueDate.isBefore(asOf);
    }

    public void markOverdue(){
        if (status == LoanStatus.ACTIVE){
            this.status = LoanStatus.OVERDUE;
        }
    }

    public void markReturned(LocalDate returnDate){
        if (returnDate == null) throw new IllegalArgumentException("returnDate is required");
        if (returnDate.isBefore(checkoutDate)) throw new IllegalArgumentException("returnDate cannot be before checkoutDate");
        this.returnDate = returnDate;
        this.status = LoanStatus.RETURNED;
        bookCopy.setStatus(BookStatus.AVAILABLE);
        patron.removeActiveLoan(this);
        patron.getBorrowingHistory().add(this);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Loan)) return false;
        Loan loan = (Loan) o;
        return LOANID.equals(loan.LOANID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(LOANID);
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanId='" + LOANID + '\'' +
                ", patron=" + patron.getPatronId() +
                ", copyId=" + bookCopy.getCopyId() +
                ", checkoutDate=" + checkoutDate +
                ", dueDate=" + dueDate +
                ", returnDate=" + returnDate +
                ", status=" + status +
                '}';
    }



}
