/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author Nikita
 */
public class Flight {
    private Airplane assignedPlane;
    private Place departure, target;
    
    public Flight(Airplane plane, Place departure, Place target) {
        assignedPlane = plane;
        this.departure = departure; 
        this.target = target; 
    }
    
    public Airplane getAssignedPlane() {
        return assignedPlane; 
    }
    
    public Place getDeparture() {
        return departure; 
    }
    
    public Place getTarget() {
        return target; 
    }
    
    public String toString() {
        return assignedPlane.toString() + " (" + departure 
                + "-" + target + ")";
    }
    
}
