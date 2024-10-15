
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
      
        Statistics statisticsAll = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        int input;
        
        System.out.println("Enter numbers:");
        while((input = scanner.nextInt()) != -1) {
            statisticsAll.addNumber(input);
            
            if(input % 2 == 0) {
                statisticsEven.addNumber(input);
            } else {
                statisticsOdd.addNumber(input); 
            }
        }
        
        System.out.println("Sum:" + statisticsAll.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of oddd numbers: " + statisticsOdd.sum());
        
    }
}
