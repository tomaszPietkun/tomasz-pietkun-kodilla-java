package com.kodilla.testing.calculator;

public class Calculator {
    public int add;
    int x;
    int y;

    public Calculator(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int add() {
        return x + y;
    }


    public int substraction () {
        return x - y;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator(15, 10);
        calculator.add();
        calculator.substraction();
    }
}