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
    private String name;
    private int qty, unitPrice;
    
    public Item(String product, int qty, int unitPrice) {
        name = product; 
        this.qty = qty; 
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return unitPrice * qty; 
    }
    
    public void increaseQuantity() {
        qty++;
    }
    
    public String toString() {
        return(name+": " + qty); 
    }
    
}
