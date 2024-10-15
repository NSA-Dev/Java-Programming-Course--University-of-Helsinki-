
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum, number, count;

        sum = number = 0;

        while (true) {
            System.out.println("Give a number:");
            number = scanner.nextInt();

            if (number == 0) {

                System.out.println("Sum of the numbers: "
                        + sum);
                break;
            } else {

                sum += number;
            }
        }
    }
}
