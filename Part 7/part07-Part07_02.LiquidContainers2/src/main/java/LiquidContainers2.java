
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {

        Container first = new Container();
        Container second = new Container();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);

            if (command.equals("remove")) {
                second.remove(value);
            } else if (command.equals("add")) {
                first.add(value);
            } else if (command.equals("move")) {
                if (value > first.contains()) {
                    value = first.contains();
                }
                first.remove(value);
                second.add(value);
            }
        }

    }

}
