
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
    private TodoList list;
    private Scanner inputStream;

    
    
    public UserInterface(TodoList tasks, Scanner scanner) {
        list = tasks; 
        inputStream = scanner;

    }
    
    public void start() {
        while(true) {
        System.out.println("Command:");
            String task;
            int index; 
            String command = inputStream.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.println("To add:");
                task = inputStream.nextLine();
                list.add(task);
            } else if (command.equals("list")) {
                list.print(); 
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                index = Integer.valueOf(inputStream.nextLine());
                list.remove(index);
            } else {
                System.out.println("Unknown command");
            }
            
        
        }
    }
}
