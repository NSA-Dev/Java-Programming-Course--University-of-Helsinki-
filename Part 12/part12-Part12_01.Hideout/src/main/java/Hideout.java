/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class Hideout<T> {

    private T inside;

    public void putIntoHideout(T toHide) {
        inside = toHide;
    }

    public T takeFromHideout() {
        T taken = inside;
        inside = null;
        return taken;
    }

    public boolean isInHideout() {
        if(inside != null) {
            return true;
        }
        
        return false; 
    }

}
