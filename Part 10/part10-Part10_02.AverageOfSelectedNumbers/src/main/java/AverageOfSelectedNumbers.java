
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> inputs = new ArrayList<String>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            inputs.add(input);
        }
        System.out.println("Print the average "
                + "of the negative numbers "
                + "or the positive numbers? (n/p)");
        String choice = scanner.nextLine();

        if (choice.equals("p")) {
            double avgPos = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(num -> num > 0)
                    .average()
                    .getAsDouble();
            System.out.println("average of the positive numbers: "
                    + avgPos);
        } else if (choice.equals("n")) {
            double avgPos = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(num -> num < 0)
                    .average()
                    .getAsDouble();
            System.out.println("average of the positive numbers: "
                    + avgPos);
        } else {
            ; // NOP  
        }

    }
}
