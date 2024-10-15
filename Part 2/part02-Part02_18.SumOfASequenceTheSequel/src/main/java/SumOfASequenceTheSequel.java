
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");
        int lower = scanner.nextInt();
        System.out.println("Last number?");
        int upper = scanner.nextInt();
        int sum = 0;
        
        for(int i = lower; i <= upper; i++) {
            sum += i;
        }
        
        System.out.println("The sum is " + sum);

    }
}
