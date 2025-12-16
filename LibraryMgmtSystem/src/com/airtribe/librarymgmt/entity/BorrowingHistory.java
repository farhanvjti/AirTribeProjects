package com.airtribe.librarymgmt.entity;

import com.airtribe.librarymgmt.entity.enums.LoanStatus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/*
public class BorrowingHistory {
    private final List loans;
    public BorrowingHistory(List loans) {
        this.loans = Collections.unmodifiableList(new ArrayList<>(Objects.requireNonNull(loans)));
    }
    public List<Loan> getByStatus(LoanStatus status) {
        return loans.stream()
                .filter(l -> l.getStatus() == status)
                .toList(); // Java 16+ has Stream.toList()
    }

}*/
