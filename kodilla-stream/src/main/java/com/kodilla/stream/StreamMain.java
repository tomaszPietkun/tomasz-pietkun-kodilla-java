package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Secrets Under Trees", (a) -> "ABC " + a + " ABC");
        poemBeautifier.beautify("Tiny little secrets", (a) -> "!! " + a + " !!");
        poemBeautifier.beautify("And If They Were DUG UP," , String::toLowerCase);
        poemBeautifier.beautify("Someone would probably get hurt", String::toUpperCase);

    }
}
