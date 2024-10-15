/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Nikita
 */
public class TemperatureSensor implements Sensor {

    private int state;

    public TemperatureSensor() {
        state = 0;
    }

    @Override
    public boolean isOn() {
        if (state == 1) {
            return true;
        }

        return false;
    }

    @Override
    public void setOn() {
        state = 1; 
    }

    @Override
    public void setOff() {
        state = 0; 
    }

    @Override
    public int read() {
        if(state == 1) {
            int random = ThreadLocalRandom.current().nextInt(-30, 31);
            return(random);
        } else {
            throw new IllegalStateException("The sensor is off"); 
        }
    }

}
