
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
public class Recipe {
    private String name;
    private int prepTime;
    private ArrayList <String> ingredients;
    
    public Recipe(String name) {
        this.name = name;
        ingredients = new ArrayList<String>(); 
    }
    
    public void setPrepTime(int time) {
        this.prepTime = time; 
    }
    
    public void addIngredient(String ingrName) {
        ingredients.add(ingrName); 
    }
    
    public String getName() {
        return name;
    }
    
    public int getPrepTime() {
        return prepTime; 
    }
   public ArrayList <String> getIngredients() {
       return ingredients;
   } 
    
    
    public void printRecipe() {
        System.out.println(name);
        System.out.println(prepTime);
        for(String s: ingredients) {
            System.out.println(s);
        }
        
    }
}
