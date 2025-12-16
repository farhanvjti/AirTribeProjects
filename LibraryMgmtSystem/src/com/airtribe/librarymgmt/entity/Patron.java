package com.airtribe.librarymgmt.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Setter
@Getter
public class Patron extends Person {
    private final String patronId;
    private final List<Loan> activeLoans = new ArrayList<>();
    private final BorrowingHistory borrowingHistory = new BorrowingHistory();
    public Patron(String patronId, String name, String email, String phoneNum) {
        if (patronId == null || patronId.isBlank()) throw new IllegalArgumentException("patronId is required");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name is required");
        this.patronId = patronId;
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public List<Loan> getActiveLoans() {
        return Collections.unmodifiableList(activeLoans);
    }
    public BorrowingHistory getBorrowingHistory() {
        return borrowingHistory;
    }
    // Domain helpers (to be used by services)
    public void addActiveLoan(Loan loan) {
        if (loan == null) throw new IllegalArgumentException("loan cannot be null");
        activeLoans.add(loan);
    }

    public void removeActiveLoan(Loan loan) {
        activeLoans.remove(loan);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patron)) return false;
        Patron patron = (Patron) o;
        return patronId.equals(patron.patronId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patronId);
    }

    @Override
    public String toString() {
        return "Patron{" +
                "patronId='" + patronId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", activeLoans=" + activeLoans.size() +
                '}';
    }
}
