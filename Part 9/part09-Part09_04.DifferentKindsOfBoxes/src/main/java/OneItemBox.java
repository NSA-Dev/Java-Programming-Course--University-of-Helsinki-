/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class OneItemBox extends Box{
    private Item[] contents;
    
    public OneItemBox() {
        contents = new Item[1]; 
    }

    @Override
    public void add(Item item) {
        if(contents[0] == null) {
            contents[0] = item; 
        }
    }

    @Override
    public boolean isInBox(Item item) {
         if(contents[0] != null && contents[0].equals(item)) {
             return true;
         }
         return false; 
    }
    
}
