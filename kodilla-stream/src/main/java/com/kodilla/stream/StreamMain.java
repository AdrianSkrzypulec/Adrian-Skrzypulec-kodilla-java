package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

import java.util.Locale;

public class StreamMain {

    public static void main(String[] args) {

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        poemBeautifier.beautify("Tekst do poprawienia", (text -> text + "?"));
//        poemBeautifier.beautify("Tekst do poprawienia", (text -> text.toUpperCase()));
//        poemBeautifier.beautify("Tekst do poprawienia", (text -> "✌ " + text + "!!!"));
   }
}