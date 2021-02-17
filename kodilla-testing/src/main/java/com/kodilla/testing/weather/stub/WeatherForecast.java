package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }


    public double calculateAverageTemp() {

        double tempSum = 0;
        double averageTemp = 0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            tempSum = tempSum + temperature.getValue();
        }
        averageTemp = tempSum / calculateForecast().size();
        return averageTemp;
    }


    public double calculateMedianTemp() {

        double median = 0;
        List<Double> MedianList = new ArrayList<Double>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            MedianList.add(temperature.getValue());
        }

        Collections.sort(MedianList);
        if (MedianList.size() % 2 == 0) {
            median = (MedianList.get(MedianList.size() / 2) + MedianList.get(MedianList.size() / 2 - 1)) / 2;
        } else {
            median = MedianList.get(MedianList.size() / 2);
        }
        return median;
    }


}
