
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
public class MisplacingBox extends Box {

    private ArrayList<Item> contents;

    public MisplacingBox() {
        contents = new ArrayList<Item>();
    }

    @Override
    public void add(Item item) {
        contents.add(item); 
    }

    @Override
    public boolean isInBox(Item item) {
        return false; 
    }

}
