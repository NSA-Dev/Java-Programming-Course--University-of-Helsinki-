
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nikita
 */
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CookBook {

    private ArrayList<Recipe> recipes;

    public CookBook() {
        recipes = new ArrayList<Recipe>();
    }

    public void addRecipes(ArrayList<String> textSource) {

        int lineCount = 0;
        Recipe temp = null;
        for (int i = 0; i < textSource.size(); i++) {
            if (lineCount == 0) {
                temp = new Recipe(textSource.get(i));
                lineCount++;
            } else if (lineCount == 1) {
                temp.setPrepTime(Integer.valueOf(textSource.get(i)));
                lineCount++;
            } else if (textSource.get(i).isEmpty()) {
                recipes.add(temp);
                lineCount = 0;
            } else {
                temp.addIngredient(textSource.get(i));
                lineCount++;
            }
        }
    }

    public void listRecipes() {
        System.out.println("\nRecipes:");
        for (Recipe r : recipes) {
            System.out.println(r.getName() + ", cooking time: "
                    + r.getPrepTime());
        }
    }

    public void findName(String name) {
        System.out.println("\nRecipes:");
        for (Recipe r : recipes) {
            if (r.getName().contains(name)) {
                System.out.println(r.getName() + ", cooking time: "
                        + r.getPrepTime());

            }
        }
    }

    public void findTime(int timeLimit) {
        for (Recipe r : recipes) {
            if (r.getPrepTime() <= timeLimit) {
                System.out.println(r.getName() + ", cooking time: "
                        + r.getPrepTime());
            }
        }
    }

    public void findIngredient(String ingredient) {
        for (Recipe r : recipes) {
            if (r.getIngredients().contains(ingredient)) {
                System.out.println(r.getName() + ", cooking time: "
                        + r.getPrepTime());
            }
        }
    }

    public void startUI(Scanner iStream) {
        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("\nEnter command:");
            String command = iStream.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                listRecipes();
            } else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String searchedName = iStream.nextLine();
                findName(searchedName);
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int timeLimit = Integer.valueOf(iStream.nextLine());
                findTime(timeLimit);
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String searchedIngr = iStream.nextLine();
                findIngredient(searchedIngr);
            } else {
                System.out.println("Invalid input, please try again");
            }

        }
    }

    public void printAll() {
        for (Recipe r : recipes) {
            r.printRecipe();
        }
    }
}
