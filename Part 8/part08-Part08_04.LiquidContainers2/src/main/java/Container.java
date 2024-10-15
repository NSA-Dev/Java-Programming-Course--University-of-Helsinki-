/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class Container {
    private static final int LIMIT  = 100;
    private int level, capacity;
    
    public Container() {
        level = 0;
        capacity = LIMIT; 
    }
    
    public int contains() {
        return level; 
    }
    
    public void add(int amount) {
        if(amount > 0) {
            if(amount > capacity){
                level += capacity; 
                capacity = 0; 
            } else {
                level += amount;
                capacity -= amount; 
            }
        }
    }
    
    public void remove(int amount) {
        if(amount > 0) {
            if(amount > level) {
                level = 0; 
                capacity = LIMIT; 
            } else {
                level -= amount; 
                capacity += amount; 
            }
        }
    }
    
    public String toString() {
        return (level + "/"+ LIMIT); 
    }
}
