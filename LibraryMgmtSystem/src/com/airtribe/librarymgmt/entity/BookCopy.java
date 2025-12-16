package com.airtribe.librarymgmt.entity;

import com.airtribe.librarymgmt.entity.enums.BookStatus;

public class BookCopy extends Book {
    Book bk;
    String copyId;
    BookStatus status;
}
