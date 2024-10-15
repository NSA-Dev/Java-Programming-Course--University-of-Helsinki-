
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int printCount = Integer.valueOf(scanner.nextLine());
         
        // printing
        Random randInstance = new Random();
        for(int i = 0; i < printCount; i++) {
            int randomNumber = randInstance.nextInt(11);
            System.out.println(randomNumber);
        }
    }

}
