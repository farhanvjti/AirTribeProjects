package com.airtribe.librarymgmt.entity;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Getter
public abstract class Book {
    private final String title;
    private final String author;
    private final String isbn;
    private final int publicationYear;
    // Relationship: one Book → many BookCopies
   private List<BookCopy> copies = new ArrayList<>();

    Book(String title, String author, String isbn, int publicationYear) {
        if (title==null || title.isBlank()) throw new IllegalArgumentException("title is required");
        if (author==null || author.isBlank()) throw new IllegalArgumentException("author is required");
        if (isbn==null || isbn.isBlank()) throw new IllegalArgumentException("isbn is required");
        if (publicationYear<=0) throw new IllegalArgumentException("publicationYear is required");

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
    }
    // Relationship management
    public void addCopy(BookCopy copy) {
        if (copy == null) throw new IllegalArgumentException("copy cannot be null");
        copies.add(copy);
    }

    public List<BookCopy> getCopies() {
        return Collections.unmodifiableList(copies);
    }
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if(!(obj instanceof Book)) return false;
        Book book = (Book)obj;
        return isbn.equals(book.isbn);
    }
    @Override
    public int hashCode(){
        return Objects.hash(isbn);
    }
    @Override
    public String toString(){
        return "Book{" +
                "isbn='" +isbn +'\''+
                ", title='" + title +'\''+
                ", author='"+ author +'\''+
                ", publicationYear="+ publicationYear+
                '}';
    }
    // Abstract behavior: subclasses must define how they are represented
    public abstract String getDescription();
}
