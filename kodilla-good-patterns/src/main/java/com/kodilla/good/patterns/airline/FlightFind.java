package com.kodilla.good.patterns.airline;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightFind {

    private final ArrayList<Flight> flights = new ArrayList<>();

    public FlightFind() {

        this.flights.add(new Flight("GDA", "KRA"));
        this.flights.add(new Flight("WAW", "WRO"));
        this.flights.add(new Flight("WAW", "GDA"));
        this.flights.add(new Flight("KRA", "WRO"));
        this.flights.add(new Flight("GDA", "WAW"));
    }

    public String checkIfFlightExist(Flight flight) {

        boolean directFlightIsFound = flights.contains(flight);

        if (directFlightIsFound) {
            return "Direct flight: \n" + flight;
        } else {
            return "Direct flight not found";
        }
    }

    public String checkIfIndirectFlightExist(Flight flight) {

        String departure = flight.getDeparture();
        String arrival = flight.getArrival();

        ArrayList<Flight> departureFlights = getFlightsFromCity(departure);
        ArrayList<Flight> arrivalFlights = getFlightsToCity(arrival);

        ArrayList<Flight> indirectFLightsFrom = departureFlights.stream()
                .filter(a -> arrivalFlights.stream()
                        .anyMatch(d -> d.getDeparture().equals(a.getArrival())))
                .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Flight> indirectFLightsTo = arrivalFlights.stream()
                .filter(d -> departureFlights.stream()
                        .anyMatch(a -> a.getArrival().equals(d.getDeparture())))
                .collect(Collectors.toCollection(ArrayList::new));

        String indirectFlights = Stream.of(indirectFLightsFrom, indirectFLightsTo)
                .flatMap(Collection::stream)
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        if (indirectFLightsFrom.isEmpty() && indirectFLightsTo.isEmpty()) {
            return "\nIndirect flights not found";
        } else {
            return "\nIndirect flights:\n" + indirectFlights;
        }
    }

    public ArrayList<Flight> getFlightsFromCity(String city) {

        return flights.stream()
                .filter(f -> f.getDeparture().equals(city))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Flight> getFlightsToCity(String city) {

        return flights.stream()
                .filter(f -> f.getArrival().equals(city))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}