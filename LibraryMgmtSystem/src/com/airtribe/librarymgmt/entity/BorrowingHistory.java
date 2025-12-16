package com.airtribe.librarymgmt.entity;

import com.airtribe.librarymgmt.entity.enums.LoanStatus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class BorrowingHistory {
    private final List<Loan> loans =  new ArrayList<>();
    public void add(Loan loan) {
        if (loan == null) throw new IllegalArgumentException("loan cannot be null");
        loans.add(loan);
    }

    public List<Loan> getLoans() {
        return Collections.unmodifiableList(loans);
    }

    @Override
    public String toString() {
        return "BorrowingHistory{loans=" + loans.size() + "}";
    }
}