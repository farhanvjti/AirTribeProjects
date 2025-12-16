package com.airtribe.librarymgmt.entity;

import com.airtribe.librarymgmt.entity.enums.BookStatus;
import lombok.Getter;

@Getter
public class BookCopy extends Book {

    private final String copyId;
    private BookStatus status;

    public BookCopy(String isbn, String title, String author,
                    int publicationYear, String copyId,
                    BookStatus status) {
        super(isbn, title, author, publicationYear);
        if (copyId == null || copyId.isBlank()) throw new IllegalArgumentException("copyId is required");
        if (status == null) throw new IllegalArgumentException("status is required");

        this.copyId = copyId;
        this.status = status;
    }
    public void setStatus(BookStatus status) {
        if (status == null) throw new IllegalArgumentException("status cannot be null");
        this.status = status;
    }

    @Override
    public String getDescription() {
        return String.format("Copy %s of '%s' by %s (%d) - Status: %s",
                copyId, super.getTitle(), getAuthor(), getPublicationYear(), status);
    }
}
