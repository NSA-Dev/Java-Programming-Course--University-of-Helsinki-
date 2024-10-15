/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class Fitbyte {

    private int age, restingHR;
    

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHR = restingHeartRate;
        
    }

    public double targetHeartRate(double percentageOfMax) {
        double targetHR = ((206.3 - (0.711 * this.age)) - this.restingHR) * (percentageOfMax) + this.restingHR;
        
        return targetHR; 
    }
}
