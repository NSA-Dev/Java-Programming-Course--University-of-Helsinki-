
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum, number, count;

        sum = number = count = 0;

        while (true) {
            System.out.println("Give a number:");
            number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Number of numbers: "
                        + count);
                System.out.println("Sum of the numbers: "
                        + sum);
                break;
            } else {
                count++;
                sum += number;
            }
        }
    }
}
