/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class Item {

    private String itemName;
    private int weight;

    public Item(String itemName, int weight) {
        this.itemName = itemName;
        this.weight = weight;
    }

    public String getName() {
        return itemName;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return itemName + " (" + weight
                + " kg)";

    }
}
