
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0, count = 0; 

        // User inputs (shoud be print instead of printLn)
        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        //file IO 
        try(Scanner fileScanner = new Scanner(Paths.get(file))) {
            while(fileScanner.hasNextLine()) {
                number = Integer.valueOf(fileScanner.nextLine());
                if(number <= upperBound && number >= lowerBound) {
                    count++; 
                }
            }
        } catch(Exception fileErr) {
            System.out.println("Failed to read from a file:" 
                    + fileErr.getMessage());
        }
        
        System.out.println("Numbers: " + count);

    }

}
