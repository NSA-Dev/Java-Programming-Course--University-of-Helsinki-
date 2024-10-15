/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Nikita
 */
public class FlightControl {

    private HashMap<String, Airplane> planeList;
    private HashMap<String, Flight> flightList;
    private HashMap<String, Place> locationList;

    public FlightControl() {
        planeList = new HashMap<>();
        flightList = new HashMap<>();
        locationList = new HashMap<>();
    }

    public void addPlane(String ID, int capacity) {
        planeList.put(ID, new Airplane(ID, capacity));
    }

    public void addFlight(Airplane plane, String departureID, String targetID) {
        locationList.putIfAbsent(departureID, new Place(departureID));
        locationList.putIfAbsent(targetID, new Place(targetID));

        Flight flight = new Flight(plane, locationList.get(departureID),
                locationList.get(targetID));
        flightList.put(flight.toString(), flight);

    }
    
    public Collection<Airplane> getPlaneList() {
        return planeList.values(); 
    }
    
    public Collection<Flight> getFlights() {
        return flightList.values(); 
    }
    
    public Airplane getPlane(String ID) {
        return planeList.get(ID); 
    }
    

}
