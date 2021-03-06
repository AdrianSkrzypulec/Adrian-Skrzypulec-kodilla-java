package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class MovieStore {

    public Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    public static void main(String[] args) {

        MovieStore ms = new MovieStore();

        final List<String> filmList = ms.getMovies().entrySet().stream()
                .flatMap(list -> list.getValue().stream())
                .collect(Collectors.toList());

        String filmWithSeparator = filmList.stream()
                .collect(Collectors.joining(" ! "));

        System.out.println(filmWithSeparator);
    }
}
//    Wykorzystując poznane już Streamy, wykonaj iterację po poniższej mapie tytułów
//    i wyświetl wszystkie tytuły w jednym ciągu, separując je wykrzyknikiem: