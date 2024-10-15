
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // declarations
        ArrayList<ArchiveItem> archive = new ArrayList<>();
        ArchiveItem newEntry;
        String id, name, printedId;
        Scanner scanner = new Scanner(System.in);
        printedId = "";
        // input block
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            newEntry = new ArchiveItem(id, name);
            if (archive.contains(newEntry)) {
                ; // do nothing
            } else {
                archive.add(newEntry);
            }

        }

        //output block
        System.out.println("==Items==");
        
        // loop works because we have no duplicates in our array
        for (ArchiveItem x : archive) {
            if (!(x.getId().equals(printedId))) {
                System.out.println(x.getId() + ": " + x.getName());
                printedId = x.getId();
            }
        }
    }
}
