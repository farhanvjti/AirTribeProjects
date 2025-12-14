package com.airtribe.librarymgmt.entity;

import java.util.List;

public class Patron extends Person {
    String patronId;
    List<Loan> activeLoans;
    BorrowingHistory bhistory;
}
