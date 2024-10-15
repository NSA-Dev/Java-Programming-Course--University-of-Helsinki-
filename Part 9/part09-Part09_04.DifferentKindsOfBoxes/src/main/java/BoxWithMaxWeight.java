
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class BoxWithMaxWeight extends Box {
    private ArrayList <Item> contents;
    private  int capacity;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        contents = new ArrayList <Item>();  
    }
    
    
    
    @Override
    public void add(Item item) {
        if(capacity >= item.getWeight()) {
            capacity -= item.getWeight(); 
            contents.add(item); 
        }
        
    }

    @Override
    public boolean isInBox(Item item) {
        if(contents.contains(item)) {
            return true;
        }
        return false; 
    }
    
    
    
}
