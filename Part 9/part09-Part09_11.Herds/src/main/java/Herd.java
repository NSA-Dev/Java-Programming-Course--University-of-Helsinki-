
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class Herd implements Movable{
    private List<Movable> members;
    
    public Herd() {
       members = new ArrayList<Movable>();  
    }
    
    public String toString() {
        String output = "";
        for(Movable member : members) {
            output += member.toString() + "\n"; 
        }
        return output; 
    }
    
    public void addToHerd(Movable movable) {
        members.add(movable); 
    }
    @Override
    public void move(int dx, int dy) {
       for(Movable member : members) {
           member.move(dx, dy);
       }
    }
    
}
