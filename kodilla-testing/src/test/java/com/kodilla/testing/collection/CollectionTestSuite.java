package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: start");
    }
    @After
    public void after(){
        System.out.println("Test Case: finish");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: start");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: finish");
    }
    @Test
    public void testOddNumbersExterminatorCaseEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        //When
        oddNumbersExterminator.exterminate(numbers);
        int result = even.size();
        //Then
        Assert.assertEquals(0, result);
    }
    @Test
    public void testOddNumbersExterminatorCaseFilledList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(4, result.size());

    }
}
