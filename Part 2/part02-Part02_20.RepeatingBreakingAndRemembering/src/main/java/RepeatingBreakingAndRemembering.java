
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        // declarations
        Scanner scanner = new Scanner(System.in);
        
        double average; 
        int number, sum, count, even, odd;
        
        even = odd = count = sum = 0; 
        System.out.println("Give numbers:");
        
        
        while((number = scanner.nextInt()) != -1) {
            sum += number;
            count++;
            if(number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            
        }
        
        // count average
        average = sum / (double)count; 
        // print exit message & sum
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
