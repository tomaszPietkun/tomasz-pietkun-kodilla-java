package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightScanner {
    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> flightMap = new HashMap<>();

        flightMap.put("Heathrow", true);
        flightMap.put("JFK", true);
        flightMap.put("Newark", true);

        for (String key: flightMap.keySet()) {

            if(key.equals(flight.getArrivalAirport())) {
                System.out.println("Searching for flights from: " + flight.getArrivalAirport() + "to: " + flight.getDepartureAirport() + "...");
                System.out.println("Flight found!");
            }
        }

        throw new RouteNotFoundException("We are sorry, we couldn't find any flights for you.");
    }
}
