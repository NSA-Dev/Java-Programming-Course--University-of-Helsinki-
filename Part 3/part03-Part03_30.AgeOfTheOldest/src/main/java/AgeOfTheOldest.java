
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        int maxAge = -1; 
        while (!(input = scanner.nextLine()).equals("")) {
            String[] nameAgeCSV = input.split(",");
            if((Integer.valueOf(nameAgeCSV[1]) > maxAge)) {
                maxAge = Integer.valueOf(nameAgeCSV[1]); 
            }
        }
        System.out.println("Age of the oldest: " + maxAge);
    }
}

