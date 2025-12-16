import com.airtribe.librarymgmt.entity.Book;
import com.airtribe.librarymgmt.entity.BookCopy;
import com.airtribe.librarymgmt.entity.Loan;
import com.airtribe.librarymgmt.entity.Patron;
import com.airtribe.librarymgmt.entity.enums.BookStatus;

import java.time.LocalDate;

public class Main{

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
        // 1. Create a Book (catalog entry)
        Book hobbitCatalog = new BookCopy(
                "978-0261102217", "The Hobbit", "J.R.R. Tolkien", 1937,
                "COPY-001", BookStatus.AVAILABLE
        );

        // 2. Add another copy of the same book
        BookCopy hobbitCopy2 = new BookCopy(
                "978-0261102217", "The Hobbit", "J.R.R. Tolkien", 1937,
                "COPY-002", BookStatus.AVAILABLE
        );
        hobbitCatalog.addCopy((BookCopy) hobbitCatalog); // first copy
        hobbitCatalog.addCopy(hobbitCopy2);

        // 3. Create a Patron
        Patron patron = new Patron("P001", "Alice Johnson", "alice@example.com", "555-1234");

        // 4. Checkout a book copy (Loan)
        Loan loan1 = new Loan(
                patron, "L001", hobbitCopy2,
                LocalDate.now(),  LocalDate.now().plusDays(14), LocalDate.now().plusDays(14)
        );

        System.out.println("After checkout:");
        System.out.println("Loan details: " + loan1);
        System.out.println("BookCopy status: " + hobbitCopy2.getStatus());
        System.out.println("Patron active loans: " + patron.getActiveLoans());

        // 5. Return the book
        loan1.markReturned(LocalDate.now().plusDays(10));

        System.out.println("\nAfter return:");
        System.out.println("Loan details: " + loan1);
        System.out.println("BookCopy status: " + hobbitCopy2.getStatus());
        System.out.println("Patron active loans: " + patron.getActiveLoans());
        System.out.println("Patron borrowing history: " + patron.getBorrowingHistory().getLoans());
    }
}