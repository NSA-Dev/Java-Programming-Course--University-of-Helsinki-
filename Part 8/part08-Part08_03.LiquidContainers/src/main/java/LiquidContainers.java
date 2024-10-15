
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first, second, fCapacity, sCapacity;
        
        first = second = 0;
        fCapacity = sCapacity = 100; 


        while (true) {
            System.out.println("First: " + first 
                    + "/100");
            System.out.println("Second: " + second 
                    + "/100");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            
            String command = parts[0];
             
            if (command.equals("quit")) {
                break;
            } else if (command.equals("add")) {
                int value = Integer.valueOf(parts[1]);
                if(value > 0) {
                    if(value > fCapacity) {
                        first += fCapacity;
                        fCapacity = 0; 
                    } else {
                        first += value;
                        fCapacity -= value; 
                    }
                }
            } else if (command.equals("move")) {
                int value = Integer.valueOf(parts[1]);
                if(value > 0) {
                    if(value > first) {
                        value = first;
                        first = 0;
                        fCapacity = 100; 
                        if(value > sCapacity) {
                            second += sCapacity;
                            sCapacity = 0; 
                        } else {
                            second += value; 
                            sCapacity -= value; 
                        }
                    } else {
                        first -= value; 
                        fCapacity += value;
                        if(value > sCapacity) {
                            second += sCapacity; 
                            sCapacity = 0; 
                        } else {
                            second += value; 
                            sCapacity -= value; 
                        }
                    }
                }
            } else if (command.equals("remove")) {
                int value = Integer.valueOf(parts[1]);
                if(value > 0) {
                    if(value > second) {
                        second = 0;
                        sCapacity = 100; 
                    } else {
                        second -= value;
                        sCapacity += value; 
                    }
                }
            }

        }
    }

}
