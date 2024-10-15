
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        
        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList <Integer> list = new ArrayList<>();
        int number = 0;
        while(true){
            number = scanner.nextInt();
            if (number == 9999){
                break;
            } else {
                list.add(number);
            }
        }
        
        // after that, the program prints the smallest number
        int smallest, index = 0;
        smallest = list.get(0);
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) < smallest) {
                smallest = list.get(i);
                index = i;
            }
        }
        // and its index -- the smallest number
        // might appear multiple times
        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index: " + index);
        
    }
}
