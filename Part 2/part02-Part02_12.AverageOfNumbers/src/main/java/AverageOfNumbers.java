
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum, num, count; 
        double avg; 
        
        sum = num = count = 0;
        avg = 0; 
        
        while(true) {
        
            System.out.println("Give a number:");
            num = scanner.nextInt(); 
            
            if(num == 0) {
                avg = sum / (double)count; 
                System.out.println("Average of the numbers: " 
                        + avg);
                break; 
            } else {
                sum += num;
                count++; 
            }
            
        }

    }
}
