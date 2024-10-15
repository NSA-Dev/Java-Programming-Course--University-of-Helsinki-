
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nikita
 */
public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {
        cart = new HashMap<String, Item>();
    }

    public void add(String product, int price) {
        Item temp = new Item(product, 1, price);
        if (cart.containsKey(product)) {
            cart.get(product).increaseQuantity();
        } else {
            cart.put(product, temp);
        }
    }

    public int price() {
        int total = 0;
        for (Item item : cart.values()) {
            total += item.price();
        }

        return total;
    }
    
    public void print() {
        for(Item item : cart.values()) {
            System.out.println(item.toString());
        }
    }

}
