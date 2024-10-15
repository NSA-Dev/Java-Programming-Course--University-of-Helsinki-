
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

        CookBook recipeBook = new CookBook();
        Scanner commandInput = new Scanner(System.in);

        // parsing recipes 
        ArrayList<String> text = new ArrayList<String>();
        System.out.println("File to read:");
        String fname = commandInput.nextLine();
        try ( Scanner fscan = new Scanner(Paths.get(fname))) {
            while (fscan.hasNextLine()) {
                String line = fscan.nextLine();
                text.add(line);
            }
        } catch (Exception e) {
            System.out.println("Couldn't access file:" + e);
        }
        text.add(""); // EOF MARKER
        recipeBook.addRecipes(text);
        recipeBook.startUI(commandInput);

    }

}
