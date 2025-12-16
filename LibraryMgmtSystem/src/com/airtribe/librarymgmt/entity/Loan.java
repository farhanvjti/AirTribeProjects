package com.airtribe.librarymgmt.entity;

import com.airtribe.librarymgmt.entity.enums.LoanStatus;

import java.time.LocalDate;

public class Loan {
    final String LOANID;
    LocalDate checkoutDate;
    LocalDate returnDate;
    LocalDate dueDate;
    LoanStatus status;

    public Loan(String LOANID, LocalDate checkoutDate, LocalDate returnDate, LocalDate dueDate, LoanStatus status) {
        this.LOANID = LOANID;
        this.checkoutDate = checkoutDate;
        this.returnDate = returnDate;
        this.dueDate = dueDate;
        this.status = status;
    }



}
