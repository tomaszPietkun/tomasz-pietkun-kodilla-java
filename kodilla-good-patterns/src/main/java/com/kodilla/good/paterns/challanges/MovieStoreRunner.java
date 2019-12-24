package com.kodilla.good.paterns.challanges;

import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreRunner {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        String movieStoreList = movieStore.getMovies().entrySet().stream()
                .map(e -> e.getValue())
                .flatMap(e -> e.stream())
                .collect(Collectors.joining(" ! "));

        System.out.println(movieStoreList);
    }
}
