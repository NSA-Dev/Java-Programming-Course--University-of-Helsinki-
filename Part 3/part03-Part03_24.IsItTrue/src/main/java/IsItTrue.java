
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String target = "true";
        
        System.out.println("Give a string: ");
        String input = scanner.nextLine(); 
        
        if(input.equals(target)) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
    
}
