
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input; 
        
        while(!(input = scanner.nextLine()).equals("")) {
        
            Item nextItem = new Item(input);
            items.add(nextItem); 
        }
        
        for(Item x: items) {
            System.out.println(x.toString());
        }

    }
}
