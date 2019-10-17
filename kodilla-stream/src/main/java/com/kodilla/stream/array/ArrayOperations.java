package com.kodilla.stream.array;

import java.util.stream.IntStream;
import java.util.*;


public interface ArrayOperations {

    public static OptionalDouble getAverage(int[] numbers){
        IntStream stream = IntStream.range(0, numbers.length);
        stream.toArray();
        System.out.println(Arrays.toString(numbers));

        return Arrays.stream(numbers).average();

    }
}
