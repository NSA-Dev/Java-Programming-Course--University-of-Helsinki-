
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        String usrString;
        int integer;
        double dub; 
        boolean bool; 
        
        // reading inputs
        // string
        System.out.println("Give a string: ");
        usrString = scan.nextLine();
       
        // int 
        System.out.println("Give an integer: ");
        integer = Integer.valueOf(scan.nextLine());

        // double 
        System.out.println("Give a double: ");
        dub = Double.valueOf(scan.nextLine()); 
        
        // bool
        System.out.println("Give a boolean: ");
        bool = Boolean.valueOf(scan.nextLine());
        
        //print results
        System.out.println("You gave the string " + usrString);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + dub);
        System.out.println("You gave the boolean " + bool);
    }
}
