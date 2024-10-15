
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
    
    private JokeManager manager;
    private Scanner istream;
    
    public UserInterface(JokeManager manager, Scanner stream) {
        this.manager = manager; 
        this.istream = stream; 
    }
    
    public void start() {
        while(true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String command = istream.nextLine();
            
            if(command.equals("1")) {
                System.out.println("Write a joke to be added:");
                String joke = istream.nextLine(); 
                manager.addJoke(joke); 
            } else if(command.equals("2")) {
                System.out.println(manager.drawJoke()); 
            } else if(command.equals("3")) {
                manager.printJokes();
            } else if (command.equals("X")) {
                break; 
            }    
        
        }
    }
    
}
