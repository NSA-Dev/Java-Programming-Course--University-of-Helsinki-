
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nikita
 */
public class UserInterface {

    private TodoList tasks;
    private Scanner iStream;

    public UserInterface(TodoList list, Scanner scan) {
        tasks = list;
        iStream = scan;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = iStream.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.println("To add:");
                String task = iStream.nextLine();
                tasks.add(task);
            } else if (command.equals("list")) {
                tasks.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int index = Integer.valueOf(iStream.nextLine());
                tasks.remove(index);
            }
        }
    }
}
