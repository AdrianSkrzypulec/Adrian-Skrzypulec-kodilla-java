package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {

        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookA = new HashSet<>();

        bookA.add(new Book(" Ian Fleming",
                "Casino Royale",
                1953,
                "1"));

        bookA.add(new Book(" Ian Fleming",
                "Dr. No",
                1958,
                "2"));

        bookA.add(new Book(" Ian Fleming",
                "Yoy Only Live Twice",
                1964,
                "3"));

        //When
        int median = medianAdapter.publicationYearMedian(bookA);

        //Then
        assertEquals(1958, median);
    }
}