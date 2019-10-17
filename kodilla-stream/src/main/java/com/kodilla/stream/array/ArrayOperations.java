package com.kodilla.stream.array;

import java.util.stream.IntStream;
import java.util.*;


public interface ArrayOperations {

    public static OptionalDouble getAverage(int[] numbers){
        IntStream.range(0,numbers.length)
                .map(x -> numbers[x])
                .forEach(System.out :: println);


        return IntStream.range(0, numbers.length)
                .map(x -> numbers[x])
                .average();

    }
}
