package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {

            double result = firstChallenge.divide(3, 0);
            System.out.println(result);

        } catch (ArithmeticException e) {

            double result = 0;
            System.out.println("It is impossible to divide by 0! Error:" + e);
        } finally {

            System.out.println("Put different b number!");
        }


    }
}

