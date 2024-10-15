
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long factorial = 1; 
        System.out.println("Give a number:");
        int n = scanner.nextInt();
        if(n == 0) {
            System.out.println("Factorial: "+ 1);
        }
        
        for(int i = 1; i <= n; i++) {
            factorial *= i; 
        }
        System.out.println("Factorial: " + factorial);

    }
}
