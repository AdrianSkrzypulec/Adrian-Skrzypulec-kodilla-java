package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library("Library");
        Book book1 = new Book("First Book", "First Author", LocalDate.of(2000, Month.JANUARY, 1));
        Book book2 = new Book("Second Book", "Second Author", LocalDate.of(2010, Month.FEBRUARY, 2));
        Book book3 = new Book("Third Book", "Third Author", LocalDate.of(2020, Month.MARCH, 3));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library - shallow copy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library - deep copy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        library.removeBook(book3);

        //Then
        Assertions.assertEquals(2, library.getBooks().size());
        Assertions.assertEquals(2, clonedLibrary.getBooks().size());
        Assertions.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
