/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class Bird {
    
    private String name, latinName;
    private int observations;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        observations = 0;
    }
    
    
    
    public String getName() {
        return name;
    }
    
    public String getLatinName() {
        return latinName;
    }
    
    public int getObservations() {
        return observations; 
    }
    
    public String toString() {
        return (name + " (" + latinName 
                +"): " + observations + " observations");  
    }
    
    public void observe() {
        observations++; 
    }
    
}
