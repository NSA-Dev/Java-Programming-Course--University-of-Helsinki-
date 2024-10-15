
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum, num, count;
        double avg;

        sum = num = count = 0;
        avg = 0;

        while (true) {

            num = scanner.nextInt();

            if (num == 0) {
                if (sum == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                } else {
                    avg = sum / (double) count;
                    System.out.println(avg);
                    break;
                }
            } else if (num > 0) {
                sum += num;
                count++;
            } else {
                continue;
            }

        }
    }
}
