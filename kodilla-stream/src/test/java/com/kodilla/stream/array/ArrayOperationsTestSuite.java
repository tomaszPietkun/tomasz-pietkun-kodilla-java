package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite implements ArrayOperations {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[5];
        //When
        numbers[0] = 11;
        numbers[1] = 12;
        numbers[2] = 13;
        numbers[3] = 14;
        numbers[4] = 15;
        double result = ArrayOperations.getAverage(numbers).getAsDouble();
        //Then
        Assert.assertEquals(13, result, 0.1);
    }
}
