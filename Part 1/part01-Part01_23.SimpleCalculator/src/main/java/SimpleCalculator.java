
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int f = Integer.valueOf(scanner.nextLine());
        
        
        System.out.println("Give the second number:");
        int s = Integer.valueOf(scanner.nextLine());
        
        // operations
        System.out.println(f + " + " + s + " = " + (f + s));
        System.out.println(f + " - " + s + " = " + (f - s));
        System.out.println(f + " * " + s + " = " + (f * s));
        System.out.println(f + " / " + s + " = " + (f / (double)s));
        

    }
}
