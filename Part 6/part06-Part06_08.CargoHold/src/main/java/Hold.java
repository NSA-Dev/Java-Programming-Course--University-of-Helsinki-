/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */

import java.util.ArrayList;

public class Hold {
    private int maxWeight; 
    private ArrayList<Suitcase> storage;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight; 
        storage = new ArrayList(); 
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(suitcase.totalWeight() <= maxWeight) {
            storage.add(suitcase); 
            maxWeight -= suitcase.totalWeight(); 
        }
    }
    
    public int cargoWeight() {
        int cargoWeight = 0; 
        if(storage.isEmpty()) {
            return cargoWeight;
        } else {
          for(Suitcase x: storage) {
            cargoWeight += x.totalWeight(); 
          }
          return cargoWeight; 
        }
    }
    
    public String toString() {
        return storage.size() + " suitcases (" 
                + this.cargoWeight() + " kg)"; 
    }
    
    public void printItems() {
        for(Suitcase x: storage) {
            x.printItems();
        }
    }
    
    
}
