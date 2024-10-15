
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nikita
 */
public class Warehouse {

    private Map<String, Integer> productsPrice;
    private Map<String, Integer> productsStock;

    public Warehouse() {
        productsPrice = new HashMap<String, Integer>();
        productsStock = new HashMap<String, Integer>();
    }

    public void addProduct(String name, int price, int stock) {
        if (price > 0 && stock > 0) {
            productsPrice.put(name, price);
            productsStock.put(name, stock);
        }
    }

    public int price(String product) {
        return productsPrice.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return productsStock.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (productsStock.containsKey(product)) {
            int currentStock = productsStock.get(product);
            if (currentStock > 0) {
                currentStock--;
                productsStock.put(product, currentStock);
                return true;
            }
        }

        return false;
    }
    
    public Set<String> products() {
        Set<String> productSet = new HashSet<>();
        for(String pName : productsStock.keySet()) {
            productSet.add(pName); 
        }
        return productSet; 
    }

}
