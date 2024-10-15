
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName, name;
        String[] lineParts;
        int age;

        //User input
        System.out.println("Name of the file:");
        fileName = scanner.nextLine();

        // file handling
        try ( Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                lineParts = (fileScanner.nextLine()).split(",");
                name = lineParts[0];
                age = Integer.valueOf(lineParts[1]);
                System.out.println(name + ", "
                        + "age: " + age + " years");
            }

        } catch (Exception fileErr) {
            System.out.println("Failed to read the file: "
                    + fileErr.getMessage());
        }
    }
}
