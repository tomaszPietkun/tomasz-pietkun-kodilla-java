package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;
import java.util.ArrayList;

public class OddNumbersExterminator {
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> even = new ArrayList<Integer>();
        for(Integer i: numbers){
            if(i % 2 == 0){
                even.add(i);
            }
        }
        System.out.println("size of numbers list: " + numbers.size());
        System.out.println("size of even numbers list: " + even.size());
        return even;
    }

}
