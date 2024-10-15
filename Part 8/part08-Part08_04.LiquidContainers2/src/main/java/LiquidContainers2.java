
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first, second;

        first = new Container();
        second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scan.nextLine();
            String [] parts = input.split(" "); 
            String command = parts[0];
            
            if (command.equals("quit")) {
                break;
            } else if (command.equals("add")) {
                int value = Integer.valueOf(parts[1]);
                first.add(value);
            } else if(command.equals("remove")) {
                int value = Integer.valueOf(parts[1]);
                second.remove(value);
            } else if (command.equals("move")) {
                int value = Integer.valueOf(parts[1]);
                if(value > first.contains()) {
                    second.add(first.contains());
                    first.remove(first.contains()); 
                } else {
                    first.remove(value);
                    second.add(value);
                }
            }

        }
    }

}
