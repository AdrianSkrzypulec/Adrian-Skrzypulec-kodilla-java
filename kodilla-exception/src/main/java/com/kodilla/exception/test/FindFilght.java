package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFilght {

    public Boolean findFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("KAT", true);
        flightMap.put("WRO", true);
        flightMap.put("WAW", false);

        String arrival = flight.getArrivalAirport();
        String depature = flight.getDepartureAirport();

        if (flightMap.containsKey(arrival) && flightMap.containsKey(depature) &&
                flightMap.get(arrival) && flightMap.get(depature)) {
            return true;
        }
        else {
            throw new RouteNotFoundException("Nie ma takiego lotniska");
        }
    }

    public static void main(String[] args) {

        Flight flight = new Flight("KAT", "WAW");
        FindFilght finder = new FindFilght();

        try {
            finder.findFilght(flight);
            System.out.println("Życzymy udanego lotu");
        } catch (RouteNotFoundException e) {
            System.out.println("Nie ma takiego połączenia");
        }
    }
}