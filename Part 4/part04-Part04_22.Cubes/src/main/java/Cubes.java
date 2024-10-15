
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usrInput;
        int number;
        
        while(!(usrInput = scanner.nextLine()).equals("end")) {
            number = Integer.valueOf(usrInput); 
            number = number * number * number; 
            System.out.println(number);
        }
        

    }
}
