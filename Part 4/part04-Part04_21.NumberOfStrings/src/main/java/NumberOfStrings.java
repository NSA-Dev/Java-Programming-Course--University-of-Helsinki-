
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        int count = 0;

        while (!(input = scanner.nextLine()).equals("end")) {
            count++;

        }
        System.out.println(count);

    }
}
