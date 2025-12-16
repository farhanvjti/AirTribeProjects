import com.airtribe.librarymgmt.entity.Book;
import com.airtribe.librarymgmt.entity.BookCopy;
import com.airtribe.librarymgmt.entity.enums.BookStatus;

public static void main() {
    Book hobbit = new BookCopy("978-0261102217", "The Hobbit", "J.R.R. Tolkien", 1937,
            "COPY-001", BookStatus.AVAILABLE);

    BookCopy copy2 = new BookCopy("978-0261102217", "The Hobbit", "J.R.R. Tolkien", 1937,
            "COPY-002", BookStatus.BORROWED);

// Add copies to the catalog entry
    hobbit.addCopy((BookCopy) hobbit); // first copy
    hobbit.addCopy(copy2);

// List all copies
    for (BookCopy copy : hobbit.getCopies()) {
        System.out.println(copy.getDescription());
    }
}
