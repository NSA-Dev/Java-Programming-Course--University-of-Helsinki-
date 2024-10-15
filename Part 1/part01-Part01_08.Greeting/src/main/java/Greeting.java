
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //Printing and output
        System.out.println("What's your name?");
        String usrInput = scanner.nextLine();
        
        System.out.println("Hi " + usrInput);
        
    }
}
