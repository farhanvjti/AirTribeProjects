package com.airtribe.librarymgmt.entity;

import lombok.Getter;

import java.util.List;

@Getter
public class Patron extends Person {
    String patronId;
    List<Loan> activeLoans;
    //BorrowingHistory bhistory;


    // Domain helpers (to be used by services)
    public void addActiveLoan(Loan loan) {
        if (loan == null) throw new IllegalArgumentException("loan cannot be null");
        activeLoans.add(loan);
    }

    public void removeActiveLoan(Loan loan) {
    }
}
