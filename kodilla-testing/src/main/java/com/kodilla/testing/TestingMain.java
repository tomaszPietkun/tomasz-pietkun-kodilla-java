package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(15, 10);
        calculator.add();
        calculator.substraction();

        if (calculator.add() == 25) {
            System.out.println("test ok");
        } else {
            System.out.println("Error!");
        }

        if (calculator.substraction() == 5) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }
    }
}
