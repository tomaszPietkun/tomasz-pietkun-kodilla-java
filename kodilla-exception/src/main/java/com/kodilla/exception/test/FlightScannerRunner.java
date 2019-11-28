package com.kodilla.exception.test;

public class FlightScannerRunner {

    public static void main(String[] args) {

        Flight flight = new Flight("Okecie", "Gatwick");
        FlightScanner flightScanner = new FlightScanner();

        try {

            flightScanner.findFlight(flight);

        } catch (RouteNotFoundException e) {

            System.out.println("There was an error: " + e);

        } finally {

            System.out.println("You can always check different flight on our site");

        }
    }

}
