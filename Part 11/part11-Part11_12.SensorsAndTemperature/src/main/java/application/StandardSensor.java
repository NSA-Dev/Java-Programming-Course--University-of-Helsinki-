/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Nikita
 */
public class StandardSensor implements Sensor {

    private int state;

    public StandardSensor(int param) {
        state = param;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        ; // NOP since alw on
    }

    @Override
    public void setOff() {
        ; // NOP, since alw on
    }

    @Override
    public int read() {
       return state; 
    }

}
