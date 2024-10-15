
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input, oldest;
        int maxAge = -1;
        oldest = ""; 
        while (!(input = scanner.nextLine()).equals("")) {
            String[] nameAgeCSV = input.split(",");
            if((Integer.valueOf(nameAgeCSV[1]) > maxAge)) {
                maxAge = Integer.valueOf(nameAgeCSV[1]);
                oldest = nameAgeCSV[0]; 
            }
        }
        System.out.println("Name of the oldest: " + oldest);


    }
}
