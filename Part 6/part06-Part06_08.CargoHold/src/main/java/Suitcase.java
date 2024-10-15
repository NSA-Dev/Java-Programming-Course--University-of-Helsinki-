/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> contents;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.contents = new ArrayList();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (item.getWeight() <= maxWeight) {
            contents.add(item);
            maxWeight -= item.getWeight();
        }
    }

    public int totalWeight() {

        int totalWeight = 0;
        if (!contents.isEmpty()) {
            for (Item x : contents) {
                totalWeight += x.getWeight();
            }
            return totalWeight;
        } else {
            return totalWeight;
        }
    }
    
    public void printItems() {
        if (!contents.isEmpty()) {
            for(Item x: contents) {
                System.out.println(x.toString());
            }
        }
    }

    public String toString() {
        switch(contents.size()) {
            case 0: return "no items (0 kg)";
            case 1:  return "1 item ("
                + this.totalWeight() + " kg)";
            default: return contents.size() + " items ("
                + this.totalWeight() + " kg)";
        }   
    }
    
    public Item heaviestItem() {
        if(this.contents.isEmpty()) {
            return null; 
        } else {
           Item heaviest = contents.get(0);
           for(Item x: contents) {
               if(heaviest.getWeight() < x.getWeight()) {
                   heaviest = x; 
               }
           }
           return heaviest; 
        }
    }
}
