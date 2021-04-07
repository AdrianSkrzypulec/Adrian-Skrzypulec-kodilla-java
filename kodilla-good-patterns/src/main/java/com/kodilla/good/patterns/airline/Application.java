package com.kodilla.good.patterns.airline;

public class Application {

    public static void main(String[] args) {

        String departure = "GDA";
        String arrival = "WRO";

        Flight flight = new Flight(departure, arrival);
        FlightFind flightFind = new FlightFind();

        System.out.println("\nFlights from " + departure + ":");
        flightFind.getFlightsFromCity(departure).forEach(System.out::println);

        System.out.println("\nFlights to " + arrival + ":");
        flightFind.getFlightsToCity(arrival).forEach(System.out::println);

        String directFlight = flightFind.checkIfFlightExist(flight);
        System.out.println(directFlight);

        String indirectFlight = flightFind.checkIfIndirectFlightExist(flight);
        System.out.println(indirectFlight);
    }
}
