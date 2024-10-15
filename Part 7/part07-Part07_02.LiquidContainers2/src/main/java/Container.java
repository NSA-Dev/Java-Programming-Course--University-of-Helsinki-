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

    private final int CAPACITY = 100;
    private int currentLevel;

    public Container() {
        currentLevel = 0;
    }

    public int contains() {
        return currentLevel;
    }

    public void add(int amount) {
        if (amount >= 0) {
            currentLevel += amount;
        }
        if (currentLevel > CAPACITY) {
            currentLevel = CAPACITY;
        }
    }

    public void remove(int amount) {
        if (amount >= 0) {
            if (amount > currentLevel) {
                currentLevel = 0;
            } else {
                currentLevel -= amount;
            }
        }
    }
    
    public String toString() {
        return currentLevel + "/100"; 
    }

}
