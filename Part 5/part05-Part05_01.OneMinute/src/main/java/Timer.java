/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class Timer {
    private ClockHand centiSeconds;
    private ClockHand seconds;
    
    public Timer() {
        this.centiSeconds = new ClockHand(100); 
        this.seconds = new ClockHand(60); 
    }
    
    public String toString() {
        return seconds + ":" + centiSeconds; 
    }
    
    public void advance() {
        this.centiSeconds.advance(); 
        
        if(this.centiSeconds.value() == 0) {
            this.seconds.advance();
        }
    }
    
}
