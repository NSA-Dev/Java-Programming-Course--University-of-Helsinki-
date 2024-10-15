
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        final int CAPACITY = 100;

        Scanner scan = new Scanner(System.in);
        int first, second, temp;

        first = second = temp = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            // System.out.println("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                if (value >= CAPACITY || first == 100) {
                    value = CAPACITY;
                    first += (value - first);
                } else if (value < 0) {
                    ;
                } else {
                    first += value;
                }

                if (first > CAPACITY) {
                    first = CAPACITY;
                }
            } // absolute ass of a code
            else if (command.equals("move")) {
                if (value > 0) {
                    if (value > CAPACITY) {
                        value = CAPACITY;
                    }
                    if (value > first) {
                        second += first;
                        first = 0;
                    } else {
                        second += value;
                        first -= value;
                    }
                }
                if (second > CAPACITY) {
                    second = CAPACITY;
                }
            } else if (command.equals("remove")) {
                if (value > 0 && second > 0) {
                    if (value > second) {
                        second = 0;
                    } else {
                        second -= value;
                    }
                }
            }

        }
    }

}
