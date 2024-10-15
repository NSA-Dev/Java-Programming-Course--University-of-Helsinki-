
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // field vars
            String firstName, lastName, id;
            

            // scan first name, exit if empty
            firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break;
            }
            lastName = scanner.nextLine(); 
            id = scanner.nextLine(); 
            
            // add fields to our class, and pass them into the Array
            infoCollection.add(new PersonalInformation(firstName, lastName, id)); 
        }
        for(PersonalInformation entry: infoCollection) {
            System.out.println(entry.getFirstName() + " " + entry.getLastName());
        }

    }
}
