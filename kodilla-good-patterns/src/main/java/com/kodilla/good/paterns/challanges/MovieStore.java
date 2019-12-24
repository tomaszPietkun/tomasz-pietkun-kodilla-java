package com.kodilla.good.paterns.challanges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieStore {

    public Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny człowiek");
        ironManTranslations.add("Iron man");

        List<String> avengersTranslation = new ArrayList<>();
        avengersTranslation.add("Mściciele");
        avengersTranslation.add("Avengers");

        List<String> flashTranslation = new ArrayList<>();
        flashTranslation.add("Błyskawica");
        flashTranslation.add("Flash");

        Map<String, List<String>> booksTilesWithTranslations = new HashMap<>();
        booksTilesWithTranslations.put("IM", ironManTranslations);
        booksTilesWithTranslations.put("AV", avengersTranslation);
        booksTilesWithTranslations.put("FL", flashTranslation);

        return booksTilesWithTranslations;
    }

}
