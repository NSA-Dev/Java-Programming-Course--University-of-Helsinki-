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
public class Airplane {
    
    private String id;
    private int capacity;
    
    public Airplane(String id, int capacity) {
        this.id = id; 
        this.capacity = capacity; 
    }
    
    
    public String getID() {
        return id; 
    }
    
    public int getCapacity() {
        return capacity; 
    }
    
    public String toString() {
        return (id + " (" + capacity + " capacity)"); 
    }
    
}
