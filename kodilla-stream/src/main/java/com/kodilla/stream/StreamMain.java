package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {

    //    LocalDate currentDateMinus20Years = LocalDate.now().minusYears(20);

        Forum theForumUsers = new Forum();
        Map<Integer, ForumUser> theResultofFurumUsers = theForumUsers.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getDateOfBirth().getYear() < LocalDate.now().minusYears(20).getYear())
                .filter(user -> user.getPostQuantify() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

                theResultofFurumUsers.entrySet().stream()
                        .forEach(System.out::println);


//        napisz program, który:
//        zainicjuje strumień Stream przy pomocy metody stream() kolekcji
//        odfiltruje tylko tych użytkowników, którzy są mężczyznami,
//        odfiltruje tylko tych użytkowników, którzy mają co najmniej 20 lat,
//        odfiltruje tylko tych użytkowników, którzy mają co najmniej jeden opublikowany post,
//        przy pomocy kolektora utworzy mapę par, w której rolę klucza będzie pełnił unikalny identyfikator użytkownika,
//        wyświetli otrzymaną mapę wynikową.

//------------------------------------------------------------------------------------
//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//
//        System.out.println(theResultStringOfBooks);
//-------------------------------------------------------------------------------------
//        BookDirectory theBookDirectory = new BookDirectory();
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);
//--------------------------------------------------------------------------------------
//        BookDirectory theBookDirectory = new BookDirectory();
//        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toList());
//
//        System.out.println("# elements: " + theResultListOfBooks.size());
//        theResultListOfBooks.stream()
//                .forEach(System.out::println);
//---------------------------------------------------------------------------------------
//        BookDirectory theBookDirectory = new BookDirectory();
//        theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .forEach(System.out::println);
//---------------------------------------------------------------------------------------
//        People.getList()
//                .stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);
//----------------------------------------------------------------------------------------
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);
// ---------------------------------------------------------------------------------------
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        poemBeautifier.beautify("Tekst do poprawienia", (text -> text + "?"));
//        poemBeautifier.beautify("Tekst do poprawienia", (text -> text.toUpperCase()));
//        poemBeautifier.beautify("Tekst do poprawienia", (text -> "✌ " + text + "!!!"));
//----------------------------------------------------------------------------------------
   }
}