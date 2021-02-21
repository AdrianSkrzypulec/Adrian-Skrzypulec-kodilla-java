package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

import java.util.Locale;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Tekst do poprawienia", (text -> text + "?"));
        poemBeautifier.beautify("Tekst do poprawienia", (text -> text.toUpperCase()));
        poemBeautifier.beautify("Tekst do poprawienia", (text -> "✌ " + text + "!!!"));
    }
}