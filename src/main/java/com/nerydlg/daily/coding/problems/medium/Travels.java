package com.nerydlg.daily.coding.problems.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Travels {


    class Location {
        int city;
        int cost;

        public Location(int city, int cost) {
            this.city = city;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "city=" + city +
                    ", cost=" + cost +
                    '}';
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        Map<Integer, Stack<Location>> flightsByCity = getAdjacencyMatrix(flights);
        return getCostToGetDestiny(flightsByCity, dst, src, K, 0, new HashMap<>());
    }

    public int getCostToGetDestiny(Map<Integer, Stack<Location>> flights, int destiny,  int src, int stops, int cost, Map<Integer, Boolean> visited) {
        if(src == destiny) return cost;
        boolean hasBeenVisited = !visited.containsKey(src)? false : visited.get(src);
        if(flights.size() == 0 || stops < 0 || flights.get(src) == null || hasBeenVisited) return -1;
        visited.put(src, true);
        Stack<Location> locations = flights.get(src);
        Location nextStop = null;
        int min = Integer.MAX_VALUE;
        while(!locations.empty()) {
            nextStop = locations.pop();
            int nextFlight = getCostToGetDestiny(flights, destiny, nextStop.city, stops-1,  cost+nextStop.cost, visited);
            if(nextFlight >= 0) {
                min = Math.min(min, nextFlight);
            }
        }
        return min;
    }

    public Map<Integer, Stack<Location>> getAdjacencyMatrix(int[][] flights) {
        Map<Integer, Stack<Location>> flightsByCity = new HashMap<>();
        for( int i = 0; i < flights.length; i++ ){
            Location location = new Location(flights[i][1], flights[i][2]);
            Stack<Location> locations = null;
            if(flightsByCity.containsKey(flights[i][0])) {
                locations = flightsByCity.get(flights[i][0]);
            } else {
                locations = new Stack<>();
            }
            locations.push(location);
            flightsByCity.put(flights[i][0], locations);
        }
        return flightsByCity;
    }
}
