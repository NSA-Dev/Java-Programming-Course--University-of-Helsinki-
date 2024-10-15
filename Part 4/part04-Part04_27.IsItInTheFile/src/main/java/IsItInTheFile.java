
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matchFlag = 0; 

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try(Scanner fileScanner = new Scanner(Paths.get(file))) {
            while(fileScanner.hasNextLine()) {
                if(fileScanner.nextLine().equals(searchedFor)){
                    System.out.println("Found!");
                    matchFlag = 1; 
                }
            }
            if (matchFlag == 0) {
                System.out.println("Not found.");
            }
            
        } catch (Exception fileError) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
