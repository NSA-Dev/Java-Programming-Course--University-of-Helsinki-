/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipe;

import java.util.ArrayList;


/**
 *
 * @author Nikita
 */
public class Pipe<T> {

    private ArrayList<T> pipeContents;

    public Pipe() {
        pipeContents = new ArrayList<>();
    }

    public T takeFromPipe() {
        if(!this.isInPipe()) {
            return null; 
        }
        T taken = pipeContents.get(0);
        pipeContents.remove(0);
        return taken; 
    }
    public void putIntoPipe(T value) {
        pipeContents.add(value);
    }
    
    public boolean isInPipe() {
        if(pipeContents.isEmpty()) {
            return false;
        }
        return true; 
    }
}
