
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName, line;

        System.out.println("Which file should have its contents printed?");
        fileName = scanner.nextLine();

        try ( Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (Exception readFailed) {
            System.out.println("Failed to read from a file: "
                    + readFailed.getMessage());
        }

    }
}
